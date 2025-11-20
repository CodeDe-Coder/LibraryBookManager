import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();  // creating a Library object

        while (true) {
            // Menu
            System.out.println("\n===== LIBRARY BOOK MANAGER =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clears extra newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("\nEnter book title: ");
                    String title = sc.nextLine();

                    System.out.print("\nEnter author name: ");
                    String author = sc.nextLine();

                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Issue Book
                    System.out.print("\nEnter the title of the book to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle);
                    break;

                case 3:
                    // Return Book
                    System.out.print("\nEnter the title of the book to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 4:
                    // Search Book
                    System.out.print("\nEnter the title of the book to search: ");
                    String searchTitle = sc.nextLine();
                    Book found = library.searchBook(searchTitle);

                    if (found != null) {
                        System.out.println("\nBook Found!");
                        found.display();
                    } else {
                        System.out.println("\nBook not found.");
                    }
                    break;

                case 5:
                    // Display all books
                    library.displayAllBooks();
                    break;

                case 6:
                    // Exit program
                    System.out.println("\nExiting Library Manager...");
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
