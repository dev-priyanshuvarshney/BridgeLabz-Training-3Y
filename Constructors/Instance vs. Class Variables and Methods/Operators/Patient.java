class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;
    final String patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("Not a Patient object.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ravi Sharma", 45, "Fever", "PAT001");
        Patient p2 = new Patient("Meena Gupta", 30, "Fracture", "PAT002");
        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);
        Patient.getTotalPatients();
        String notPatient = "Hello World";
        p1.displayPatientDetails(notPatient);
    }
}
