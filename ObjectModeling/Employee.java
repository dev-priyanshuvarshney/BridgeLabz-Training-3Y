class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee: " + name;
    }
}

class Department {
    private String deptName;
    private Employee[] employees;
    private int count;

    public Department(String deptName, int maxEmployees) {
        this.deptName = deptName;
        employees = new Employee[maxEmployees];
        count = 0;
    }

    public void addEmployee(String name) {
        if (count < employees.length) {
            employees[count++] = new Employee(name);
        }
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
    }
}

class Company {
    private String companyName;
    private Department[] departments;
    private int count;

    public Company(String companyName, int maxDepartments) {
        this.companyName = companyName;
        departments = new Department[maxDepartments];
        count = 0;
    }

    public Department addDepartment(String deptName, int maxEmployees) {
        if (count < departments.length) {
            Department d = new Department(deptName, maxEmployees);
            departments[count++] = d;
            return d;
        }
        return null;
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (int i = 0; i < count; i++) {
            departments[i].showEmployees();
        }
    }

    public void closeCompany() {
        System.out.println("Closing company: " + companyName);
        departments = null;
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company c = new Company("TechCorp", 3);

        Department d1 = c.addDepartment("IT", 5);
        Department d2 = c.addDepartment("HR", 3);

        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        d2.addEmployee("Charlie");

        c.showCompanyStructure();

        c.closeCompany();
    }
}
