class BookNew {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    // Constructor
    public BookNew(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    // Borrow method
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }


    // Display method
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        BookNew book1 = new BookNew("1984", "George Orwell", 12.99, true);
        book1.displayBook();
        book1.borrowBook();
        book1.displayBook();
    }
}
