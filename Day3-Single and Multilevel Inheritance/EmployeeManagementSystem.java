package Inheritance;
class Employee{
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee{
    private String universityName;
    public Intern(String name, int id, double salary, String universityName){
        super(name, id, salary);
        this.universityName = universityName;
    }
    public String getUniversityName(){
        return universityName;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("University Name: " + universityName);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alejandro", 101, 80000, 5);
        Employee emp2 = new Developer("Bruno", 102, 60000, "Java");
        Employee emp3 = new Intern("Chalamet", 103, 20000, "SRM University");
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();
        emp3.displayDetails();
        System.out.println();
    }
}
