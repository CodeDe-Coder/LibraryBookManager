import java.util.ArrayList;

public class Library {

    // ArrayList to store Book objects
    private ArrayList<Book> books;

    // Constructor: creates an empty Library
    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Search for a book by title (case-insensitive)
    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b; // found
            }
        }
        return null; // not found
    }

    // Issue a book
    public void issueBook(String title) {
        Book book = searchBook(title);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued!");
        } else {
            book.issue();
            System.out.println("Book issued successfully!");
        }
    }

    // Return a book
    public void returnBook(String title) {
        Book book = searchBook(title);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isIssued()) {
            System.out.println("Book is not issued.");
        } else {
            book.returnBook();
            System.out.println("Book returned successfully!");
        }
    }

    // Display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }
}
