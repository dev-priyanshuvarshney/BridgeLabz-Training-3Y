class Individual {
    String fullName;
    int years;

    Individual(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }

    void showInfo() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + years);
    }
}

class Mentor extends Individual {
    String subjectName;

    Mentor(String fullName, int years, String subjectName) {
        super(fullName, years);
        this.subjectName = subjectName;
    }

    void displayRole() {
        showInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subjectName);
    }
}

class Learner extends Individual {
    String gradeLevel;

    Learner(String fullName, int years, String gradeLevel) {
        super(fullName, years);
        this.gradeLevel = gradeLevel;
    }

    void displayRole() {
        showInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + gradeLevel);
    }
}

class Helper extends Individual {
    String duty;

    Helper(String fullName, int years, String duty) {
        super(fullName, years);
        this.duty = duty;
    }

    void displayRole() {
        showInfo();
        System.out.println("Role: Staff");
        System.out.println("Duty: " + duty);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Mentor t1 = new Mentor("Anita Sharma", 35, "Mathematics");
        Learner s1 = new Learner("Ravi Kumar", 16, "10th Grade");
        Helper st1 = new Helper("Suresh Patel", 40, "Librarian");

        t1.displayRole();
        System.out.println();
        s1.displayRole();
        System.out.println();
        st1.displayRole();
    }
}
