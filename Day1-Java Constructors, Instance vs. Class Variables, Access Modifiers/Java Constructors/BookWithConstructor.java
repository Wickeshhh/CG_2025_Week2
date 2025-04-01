public class BookWithConstructor {
    private String title;
    private String author;
    private double price;
    //default constructor
    public BookWithConstructor(){
        this.title = "Default book";
        this.author = "Rookie101";
        this.price = 0.0;
    }
    //parameterized constructor
    public BookWithConstructor(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //getter methods
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    //setter methods
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void display(){
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        BookWithConstructor book1 = new BookWithConstructor();
        BookWithConstructor book2 = new BookWithConstructor("Harry Potter", "J K Rowling", 20.0);
        book1.display();
        System.out.println();
        book2.display();
    }
}
