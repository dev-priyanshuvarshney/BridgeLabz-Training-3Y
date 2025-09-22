import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public List<String> getMedicalHistory() { return medicalHistory; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(String id, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String id, String name, int age, String diagnosis, double consultationFee) {
        super(id, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + records);
    }
}

public class HospitalPatientManagement {
    public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.getPatientDetails();
            double bill = p.calculateBill();
            System.out.println("Total Bill: " + bill);
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        InPatient ip = new InPatient("P101", "Rahul", 30, "Surgery", 5, 2000);
        ip.addRecord("Surgery performed on 12th Sept");
        ip.addRecord("Follow-up scheduled");

        OutPatient op = new OutPatient("P102", "Neha", 25, "Flu", 500);
        op.addRecord("Consultation on 15th Sept");
        op.addRecord("Prescribed medicines for 5 days");

        Patient[] patients = {ip, op};
        processPatients(patients);
    }
}
