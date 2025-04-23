package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Database db = new Database(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        LMS lms = new LMS(db);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Add Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Add User");
            System.out.println("6. Delete User");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = getIntInput(scanner, "");

            switch (choice) {
                case 1:
                    borrowBook(lms, scanner);
                    break;
                case 2:
                    returnBook(lms, scanner);
                    break;
                case 3:
                    addBook(lms, scanner);
                    break;
                case 4:
                    deleteBook(lms, scanner);
                    break;
                case 5:
                    addUser(db, scanner);
                    break;
                case 6:
                    deleteUser(db, scanner);
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void borrowBook(LMS lms, Scanner scanner) {
        try {
            int bookId = getIntInput(scanner, "Enter Book ID: ");
            int userId = getIntInput(scanner, "Enter Student ID: ");
            lms.borrowBook(bookId, userId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void returnBook(LMS lms, Scanner scanner) {
        try {
            int bookId = getIntInput(scanner, "Enter Book ID: ");
            int userId = getIntInput(scanner, "Enter Student ID: ");
            lms.returnBook(bookId, userId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addBook(LMS lms, Scanner scanner) {
        try {
            System.out.print("Enter Book Title: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter File Path: ");
            String filePath = scanner.nextLine();
            System.out.print("Is the book available? (true/false): ");
            boolean available = scanner.nextBoolean();

            Model.Book book = new Model.Book(title, author, available, filePath);
            int userId = getIntInput(scanner, "Enter Admin User ID for Authentication: ");
            Model.User user = lms.db.searchUser(userId);
            lms.db.addBook(book, user);
            System.out.println("Book added successfully. Book ID: " + book.getBookId());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteBook(LMS lms, Scanner scanner) {
        try {
            int bookId = getIntInput(scanner, "Enter Book ID to Delete: ");
            Model.Book book = lms.db.searchBook(bookId);
            int userId = getIntInput(scanner, "Enter Admin User ID for Authentication: ");
            Model.User user = lms.db.searchUser(userId);
            lms.db.deleteBook(book, user);
            System.out.println("Book deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addUser(Database db, Scanner scanner) {
        try {
            System.out.print("Enter User Type (Admin/Student): ");
            String userType = scanner.next();
            System.out.print("Enter Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter Password: ");
            String pass = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Is the user deleted? (true/false): ");
            boolean isDeleted = scanner.nextBoolean();

            Model.User user;
            if (userType.equalsIgnoreCase("Admin")) {
                user = new Model.Admin(name, pass, email, isDeleted);
            } else {
                user = new Model.Student(name, pass, email, isDeleted);
            }

            db.addUser(user);
            System.out.println("User added successfully. User ID: " + user.getUserId());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteUser(Database db, Scanner scanner) {
        try {
            int userId = getIntInput(scanner, "Enter User ID to Delete: ");
            Model.User user = db.searchUser(userId);
            db.deleteUser(user);
            System.out.println("User deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}