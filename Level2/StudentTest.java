class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("------------------------");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Priyanshu", 101, 92);
        Student s2 = new Student("Ankit", 102, 76);
        Student s3 = new Student("Neha", 103, 48);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
