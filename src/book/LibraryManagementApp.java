/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.Scanner;

// Define a Book class
class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("You have successfully checked out '" + title + "' by " + author + ".");
        } else {
            System.out.println("'" + title + "' is already checked out.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have successfully returned '" + title + "' by " + author + ".");
        } else {
            System.out.println("'" + title + "' is already available.");
        }
    }
}

// Define a Library class to manage a collection of books
class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(int index, String title, String author) {
        if (index >= 0 && index < books.length) {
            books[index] = new Book(title, author);
        } else {
            System.out.println("Invalid index for adding a book.");
        }
    }

    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Title: " + book.getTitle() + " | Author: " + book.getAuthor() + " | Available: " + (book.isAvailable() ? "Yes" : "No"));
            }
        }
    }

    public void checkOutBook(int index) {
        if (index >= 0 && index < books.length) {
            if (books[index] != null) {
                books[index].checkOut();
            } else {
                System.out.println("No book found at this index.");
            }
        } else {
            System.out.println("Invalid index for checking out a book.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.length) {
            if (books[index] != null) {
                books[index].returnBook();
            } else {
                System.out.println("No book found at this index.");
            }
        } else {
            System.out.println("Invalid index for returning a book.");
        }
    }
}

public class LibraryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");

        // Initialize the library with a capacity of 5 books
        Library library = new Library(5);

        // Add books to the library
        library.addBook(0, "Book1", "Author1");
        library.addBook(1, "Book2", "Author2");
        library.addBook(2, "Book3", "Author3");

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. List Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter the index of the book to check out: ");
                    int checkOutIndex = scanner.nextInt();
                    library.checkOutBook(checkOutIndex);
                    break;
                case 3:
                    System.out.print("Enter the index of the book to return: ");
                    int returnIndex = scanner.nextInt();
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
