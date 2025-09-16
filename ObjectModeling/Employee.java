class Employee {
    String empName;
    int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    void showEmployee() {
        System.out.println("Employee: " + empName + " (ID: " + empId + ")");
    }
}

class Department {
    String deptName;
    Employee[] workers;
    int count;

    Department(String deptName, int size) {
        this.deptName = deptName;
        this.workers = new Employee[size];
        this.count = 0;
    }

    void addEmployee(Employee e) {
        if (count < workers.length) {
            workers[count] = e;
            count++;
        }
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (int i = 0; i < count; i++) {
            workers[i].showEmployee();
        }
    }
}

class Company {
    String companyName;
    Department[] depts;
    int dcount;

    Company(String companyName, int size) {
        this.companyName = companyName;
        this.depts = new Department[size];
        this.dcount = 0;
    }

    void addDepartment(Department d) {
        if (dcount < depts.length) {
            depts[dcount] = d;
            dcount++;
        }
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (int i = 0; i < dcount; i++) {
            depts[i].showDepartment();
            System.out.println();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c1 = new Company("TechSoft Ltd", 2);

        Department d1 = new Department("IT", 2);
        d1.addEmployee(new Employee("Ravi", 101));
        d1.addEmployee(new Employee("Neha", 102));

        Department d2 = new Department("HR", 2);
        d2.addEmployee(new Employee("Amit", 201));
        d2.addEmployee(new Employee("Priya", 202));

        c1.addDepartment(d1);
        c1.addDepartment(d2);

        c1.showCompany();

        // Composition demo: if c1 object is deleted → d1, d2 and employees cannot exist
        c1 = null;
        System.gc();
        System.out.println("\nCompany deleted → Departments and Employees also removed.");
    }
}
