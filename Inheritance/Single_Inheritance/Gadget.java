class Gadget {
    String gadgetId;
    String state;

    Gadget(String gadgetId, String state) {
        this.gadgetId = gadgetId;
        this.state = state;
    }

    void displayStatus() {
        System.out.println("Device ID: " + gadgetId);
        System.out.println("Status: " + state);
    }
}

class ClimateControl extends Gadget {
    int tempLevel;

    ClimateControl(String gadgetId, String state, int tempLevel) {
        super(gadgetId, state);
        this.tempLevel = tempLevel;
    }

    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + tempLevel + "°C");
    }
}

public class HomeSystem {
    public static void main(String[] args) {
        ClimateControl t1 = new ClimateControl("TH123", "Active", 24);
        t1.displayStatus();
    }
}
