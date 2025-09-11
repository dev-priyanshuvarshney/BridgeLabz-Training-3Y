class Student {
    static String universityName = "National University";
    static int totalStudents = 0;
    final String rollNumber;
    String name;
    String grade;

    Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Not a Student object.");
        }
    }

    void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated for " + s.name + " to " + s.grade);
        } else {
            System.out.println("Invalid object. Cannot update grade.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Anjali Verma", "STU101", "A");
        Student s2 = new Student("Rahul Singh", "STU102", "B");
        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);
        s1.updateGrade(s1, "A+");
        s1.displayStudentDetails(s1);
        Student.displayTotalStudents();
        String notStudent = "Hello World";
        s2.displayStudentDetails(notStudent);
    }
}
