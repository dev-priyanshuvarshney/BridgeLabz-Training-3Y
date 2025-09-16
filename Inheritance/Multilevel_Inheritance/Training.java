class Training {
    String trainingName;
    int length;

    Training(String trainingName, int length) {
        this.trainingName = trainingName;
        this.length = length;
    }

    void showDetails() {
        System.out.println("Course: " + trainingName);
        System.out.println("Duration: " + length + " weeks");
    }
}

class ECourse extends Training {
    String platform;
    boolean recorded;

    ECourse(String trainingName, int length, String platform, boolean recorded) {
        super(trainingName, length);
        this.platform = platform;
        this.recorded = recorded;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (recorded ? "Yes" : "No"));
    }
}

class PremiumECourse extends ECourse {
    double fee;
    double rebate;

    PremiumECourse(String trainingName, int length, String platform, boolean recorded, double fee, double rebate) {
        super(trainingName, length, platform, recorded);
        this.fee = fee;
        this.rebate = rebate;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + rebate + "%");
    }
}

public class CourseApp {
    public static void main(String[] args) {
        PremiumECourse obj = new PremiumECourse("Java Full Stack", 12, "Udemy", true, 4999, 20);
        obj.showDetails();
    }
}
