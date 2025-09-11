class Course {
    String courseName;
    int duration; 

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: ₹" + getFinalFee());
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 8);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 6, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Full Stack Development", 12, "Udemy", true, 5000, 20);

        c1.displayCourseInfo();
        System.out.println();
        c2.displayCourseInfo();
        System.out.println();
        c3.displayCourseInfo();
    }
}
