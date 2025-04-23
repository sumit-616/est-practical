package org.example;

public class Model {

    abstract static class User {
        private String name;
        private final int userId;
        private String pass;
        private String email;
        private boolean isDeleted;

        public User(String name, String pass, String email) {
            this.name = name;
            this.userId = generateUniqueId();
            this.pass = pass;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUserId() {
            return userId;
        }

        public boolean isDeleted() {
            return isDeleted;
        }

        public void setDelete(boolean deleted) {
            isDeleted = deleted;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        abstract String displayInfo();

        private int generateUniqueId() {
            return (int) (System.currentTimeMillis() % 100000);
        }
    }

    static class Admin extends User {
        public Admin(String name, String pass, String email, boolean isDeleted) {
            super(name, pass, email);
        }

        @Override
        String displayInfo() {
            return "Admin : " + getName();
        }
    }

    static class Student extends User {
        public Student(String name, String pass, String email, boolean isDeleted) {
            super(name, pass, email);
        }

        @Override
        String displayInfo() {
            return "Student : " + getName();
        }
    }

    public static class Book {
        private int bookId;
        private String title;
        private String author;
        private boolean available;
        private String filePath;
        private boolean isDeleted;
        private Student bookBorrowedBy;

        public Book(String title, String author, boolean available, String filePath) {
            this.bookId = generateUniqueId();
            this.title = title;
            this.author = author;
            this.available = available;
            this.filePath = filePath;
            this.isDeleted = false;
        }

        public int getBookId() {
            return bookId;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public boolean isDeleted() {
            return isDeleted;
        }

        public void setDelete(boolean delete) {
            isDeleted = delete;
        }

        public Student getBookBorrowedBy() {
            return bookBorrowedBy;
        }

        public void setBookBorrowedBy(Student s) {
            bookBorrowedBy = s;
        }

        private int generateUniqueId() {
            return (int) (System.currentTimeMillis() % 100000);
        }
    }
}