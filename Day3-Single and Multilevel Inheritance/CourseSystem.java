package Inheritance;
// Base Class: Course
class Course {
    String courseName;
    int duration; // in weeks
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}
// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}
// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public double getDiscountedFee() {
        return fee - (fee * discount / 100);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Price: $" + getDiscountedFee());
    }
}
// Main Class
public class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Udemy", true, 200, 20);
        System.out.println();
        poc.displayInfo();
        System.out.println();
    }
}
