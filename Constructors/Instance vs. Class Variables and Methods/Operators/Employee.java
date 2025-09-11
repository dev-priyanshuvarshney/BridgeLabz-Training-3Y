class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;
    final String id;
    String name;
    String designation;

    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
        } else {
            System.out.println("Not an Employee object.");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit Kumar", "EMP101", "Software Engineer");
        Employee e2 = new Employee("Neha Singh", "EMP102", "Project Manager");
        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);
        Employee.displayTotalEmployees();
        String notEmployee = "Hello World";
        e1.displayEmployeeDetails(notEmployee);
    }
}
