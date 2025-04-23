package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.FileNotFoundException;

public class LMS {
    Database db;

    public LMS(Database db) {
        this.db = db;
    }

    public void borrowBook(int bookId, int userId) {
        try {
            Model.Book book = db.searchBook(bookId);
            Model.Student student = (Model.Student) db.searchUser(userId);

            if (book.isDeleted()) {
                System.out.println("Book is deleted and cannot be borrowed.");
                return;
            }

            if (book.isAvailable()) {
                book.setAvailable(false);
                book.setBookBorrowedBy(student);
                System.out.println("Book borrowed successfully by " + student.getName());
            } else {
                System.out.println("Book is already borrowed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnBook(int bookId, int userId) {
        try {
            Model.Book book = db.searchBook(bookId);
            Model.Student student = (Model.Student) db.searchUser(userId);

            if (book.isDeleted()) {
                System.out.println("Book is deleted and cannot be returned.");
                return;
            }

            if (book.getBookBorrowedBy() != null && book.getBookBorrowedBy().equals(student)) {
                book.setAvailable(true);
                book.setBookBorrowedBy(null);
                System.out.println("Book returned successfully by " + student.getName());
            } else {
                System.out.println("This student did not borrow the book.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void uploadPDF(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists() || file.isDirectory()) {
                throw new FileNotFoundException("Invalid file path.");
            }
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                throw new IllegalArgumentException("File must be a PDF.");
            }
            PDDocument document = PDDocument.load(file);
            document.close();
            System.out.println("PDF uploaded successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
