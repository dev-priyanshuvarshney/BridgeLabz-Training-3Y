interface Worker {
    void performDuties();
}

class Human {
    String personName;
    int personId;

    Human(String personName, int personId) {
        this.personName = personName;
        this.personId = personId;
    }

    void showPerson() {
        System.out.println("Name: " + personName);
        System.out.println("ID: " + personId);
    }
}

class Chef extends Human implements Worker {
    String speciality;

    Chef(String personName, int personId, String speciality) {
        super(personName, personId);
        this.speciality = speciality;
    }

    public void performDuties() {
        showPerson();
        System.out.println("Role: Chef");
        System.out.println("Speciality: " + speciality);
        System.out.println("Duties: Cooking and designing menu items");
    }
}

class Waiter extends Human implements Worker {
    int tablesAssigned;

    Waiter(String personName, int personId, int tablesAssigned) {
        super(personName, personId);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        showPerson();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers and taking orders");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef c1 = new Chef("Ramesh Gupta", 101, "Italian Cuisine");
        Waiter w1 = new Waiter("Sanjay Verma", 202, 5);

        c1.performDuties();
        System.out.println();
        w1.performDuties();
    }
}
