public class Book {
    // These are properties/variables of a book
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor: runs when we create a new Book object
    public Book(String title, String author) {
        // "this.title" means the variable inside the class
        // "title" (without this) is the value passed from main
        this.title = title;
        this.author = author;
        this.isIssued = false; // a new book is always available
    }

    // Getter method → return the book title
    public String getTitle() {
        return title;
    }

    // Getter method → return the book author
    public String getAuthor() {
        return author;
    }

    // Check if the book is issued or not
    public boolean isIssued() {
        return isIssued;
    }

    // Mark book as issued
    public void issue() {
        isIssued = true;
    }

    // Mark book as returned
    public void returnBook() {
        isIssued = false;
    }

    // Display book information
    public void display() {
        System.out.println("\nTitle: " + title + "\nAuthor: " + author + 
            "\nStatus: " + (isIssued ? "Issued" : "Available"));
    }
}
