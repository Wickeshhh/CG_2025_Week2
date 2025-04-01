import java.util.Scanner;
public class CircleWithConstructor {
    private double radius;
    //default constructor
    CircleWithConstructor(){
        this.radius = 5.0;
    }
    //parameterized constructor
    CircleWithConstructor(double radius){
        this.radius = radius;
    }
    //getter method
    public double getRadius(){
        return radius;
    }
    //setter method
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void calcAreaAndCircumference(){
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.printf("Area of Circle of radius %.2f is: %.2f\n", radius, area);
        System.out.printf("Circumference of Circle of radius %.2f is: %.2f\n", radius, circumference);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        CircleWithConstructor c1 = new CircleWithConstructor();
        c1.calcAreaAndCircumference();
        System.out.println();
        CircleWithConstructor c2 = new CircleWithConstructor(r);
        c2.calcAreaAndCircumference();
        scanner.close();
    }
}
