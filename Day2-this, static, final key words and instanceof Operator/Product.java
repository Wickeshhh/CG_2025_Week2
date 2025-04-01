public class Product {

    // Static variable shared by all products
    static double discount = 10.0; // Default discount percentage

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Final to ensure immutability

    // Constructor using 'this'
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Method to display product details using instanceof
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total After Discount: $" + getTotalPriceAfterDiscount());
        } else {
            System.out.println("Invalid product object.");
        }
    }

    // Method to calculate total price after discount
    public double getTotalPriceAfterDiscount() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product.updateDiscount(15.0); // Update discount for all products

        Product product1 = new Product("Smartphone", 500.0, 2, 1001);
        Product product2 = new Product("Headphones", 100.0, 1, 1002);

        System.out.println("\n--- Product 1 Details ---");
        product1.displayProductDetails();

        System.out.println("\n--- Product 2 Details ---");
        product2.displayProductDetails();
    }
}

