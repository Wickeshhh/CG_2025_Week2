package Inheritance;
// Base Class: Person
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
// Subclass: Teacher
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println("I am a Teacher. I teach " + subject);
    }
}
// Subclass: Student
class Student extends Person {
    int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("I am a Student in grade " + grade);
    }
}
// Subclass: Staff
class Staff extends Person {
    String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayRole() {
        System.out.println("I am a Staff member working in the " + department + " department");
    }
}
// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Amit", 15, 10);
        Staff staff = new Staff("Mrs. Ramesh", 35, "Administration");
        System.out.println();
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();
        student.displayInfo();
        student.displayRole();
        System.out.println();
        staff.displayInfo();
        staff.displayRole();
        System.out.println();
    }
}
