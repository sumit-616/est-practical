
package org.example;

import java.util.List;

public class Database {
    private List<Model.Admin> adminList;
    private List<Model.Student> studentList;
    private List<Model.Book> bookList;

    public Database(List<Model.Admin> adminList, List<Model.Student> studentList, List<Model.Book> bookList) {
        this.adminList = adminList;
        this.studentList = studentList;
        this.bookList = bookList;
    }

    Model.Book searchBook(int bookId) throws Exception {
        for (Model.Book b : bookList) {
            if (b.getBookId() == bookId) return b;
        }
        throw new Exception("Book not found");
    }

    Model.User searchUser(int id) throws Exception {
        for (Model.User u : adminList) {
            if (u.getUserId() == id) return u;
        }
        for (Model.User u : studentList) {
            if (u.getUserId() == id) return u;
        }
        throw new Exception("User not found");
    }

    void addBook(Model.Book book, Model.User user) throws Exception {
        if (user instanceof Model.Admin) {
            bookList.add(book);
        } else {
            throw new Exception("No Such Admin");
        }
    }

    void deleteBook(Model.Book book, Model.User user) throws Exception {
        if (user instanceof Model.Admin) {
            book.setDelete(true);
        } else {
            throw new Exception("No Such Admin");
        }
    }

    void addUser(Model.User user) throws Exception {
        if (user instanceof Model.Admin) {
            adminList.add((Model.Admin) user);
        } else if (user instanceof Model.Student) {
            studentList.add((Model.Student) user);
        } else {
            throw new Exception("Invalid User Type");
        }
    }

    void deleteUser(Model.User user) throws Exception {
        if (user instanceof Model.Admin) {
            user.setDelete(true);
        } else if (user instanceof Model.Student) {
            user.setDelete(true);
        } else {
            throw new Exception("Invalid User");
        }
    }
}