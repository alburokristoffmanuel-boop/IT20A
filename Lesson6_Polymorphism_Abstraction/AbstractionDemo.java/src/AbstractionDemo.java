
abstract class SmartDevice {
    private String deviceName;

  
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void turnOn();

   
    public void displayInfo() {
        System.out.println("Device Name: " + deviceName);
    }
}

class SmartLight extends SmartDevice {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("The smart light turns on with 100% brightness and warm white color.");
    }
}


class SmartAirConditioner extends SmartDevice {
    public SmartAirConditioner(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("The air conditioner turns on and sets temperature to 24 degrees Celsius.");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("\n=== ABSTRACTION DEMONSTRATION ===");

        
        SmartDevice light = new SmartLight("Living Room Light");
        light.displayInfo();
        light.turnOn();

        System.out.println("-----------------------------------");

        SmartDevice ac = new SmartAirConditioner("Bedroom AC");
        ac.displayInfo();
        ac.turnOn();
    }
}