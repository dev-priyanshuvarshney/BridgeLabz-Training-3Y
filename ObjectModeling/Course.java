class Course {
    private String courseName;
    private Student[] students;
    private int count;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        students = new Student[maxStudents];
        count = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
            s.addCourse(this);
        }
    }

    public void showStudents() {
        System.out.println("Course: " + courseName);
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName());
        }
        System.out.println();
    }
}

class Student {
    private String name;
    private Course[] courses;
    private int count;

    public Student(String name, int maxCourses) {
        this.name = name;
        courses = new Course[maxCourses];
        count = 0;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course c) {
        if (count < courses.length) {
            courses[count++] = c;
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (int i = 0; i < count; i++) {
            System.out.println(courses[i].getCourseName());
        }
        System.out.println();
    }
}

class School {
    private String schoolName;
    private Student[] students;
    private int count;

    public School(String schoolName, int maxStudents) {
        this.schoolName = schoolName;
        students = new Student[maxStudents];
        count = 0;
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName());
        }
        System.out.println();
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley School", 5);

        Student s1 = new Student("Alice", 3);
        Student s2 = new Student("Bob", 3);

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Math", 5);
        Course c2 = new Course("Science", 5);
        Course c3 = new Course("History", 5);

        c1.enrollStudent(s1);
        c2.enrollStudent(s1);

        c2.enrollStudent(s2);
        c3.enrollStudent(s2);

        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();
        c1.showStudents();
        c2.showStudents();
        c3.showStudents();
    }
}
