 public class Book {

    // Static variable shared by all instances
    static String libraryName = "SRM Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final to prevent modification

    // Constructor using 'this' to initialize fields
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details using instanceof
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book.displayLibraryName();  // Static method call

        Book book1 = new Book("1984", "George Orwell", "123-XYZ");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "456-ABC");

        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}

