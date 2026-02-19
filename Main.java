import java.util.Random;

/* ========= INTERFACES ========= */

interface Flyable {
    void takeOff();
    void land();
    double maxAltitude();

    default String status() {
        return "FLY MODE";
    }
}

interface Drivable {
    void startEngine();
    void stopEngine();
    double maxSpeed();

    default String status() {
        return "DRIVE MODE";
    }
}

interface ThermalSensor {
    double readTemperatureC();
    boolean detectHuman(double thresholdC);
}

interface Communicable {
    void send(String message);
    String getDeviceId();
}

/* ========= COMPOSITION CLASSES ========= */

class Battery {
    private double level = 100;

    public void drain(double amount) {
        level -= amount;
        if (level < 0) level = 0;
    }

    public double getLevel() {
        return level;
    }
}

class GPSTracker {
    private double lat;
    private double lon;

    public void updatePosition(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String currentPosition() {
        return lat + "," + lon;
    }
}

class ThermalCamera {
    private Random rand = new Random();

    public double readTemperatureC() {
        return 30 + rand.nextDouble() * 10;
    }

    public boolean detectHuman(double thresholdC) {
        return readTemperatureC() >= thresholdC;
    }
}

/* ========= RESCUE ROBOT ========= */

class RescueRobot implements Flyable, Drivable, ThermalSensor, Communicable {

    private String id;
    private Battery battery = new Battery();
    private GPSTracker gps = new GPSTracker();
    private ThermalCamera thermal = new ThermalCamera();

    public RescueRobot(String id) {
        this.id = id;
    }

    // แก้ default method ชนกัน
    @Override
    public String status() {
        return "ROBOT: "
                + Flyable.super.status()
                + " + "
                + Drivable.super.status();
    }

    // Flyable
    public void takeOff() {
        battery.drain(5);
        System.out.println("Taking off...");
    }

    public void land() {
        battery.drain(3);
        System.out.println("Landing...");
    }

    public double maxAltitude() {
        return 120.5;
    }

    // Drivable
    public void startEngine() {
        battery.drain(2);
        System.out.println("Engine started");
    }

    public void stopEngine() {
        battery.drain(1);
        System.out.println("Engine stopped");
    }

    public double maxSpeed() {
        return 60.0;
    }

    // ThermalSensor
    public double readTemperatureC() {
        battery.drain(1);
        double temp = thermal.readTemperatureC();
        System.out.println("Temperature: " + temp);
        return temp;
    }

    public boolean detectHuman(double thresholdC) {
        battery.drain(2);
        boolean detected = thermal.detectHuman(thresholdC);
        System.out.println("Human detected: " + detected);
        return detected;
    }

    // Communicable
    public void send(String message) {
        battery.drain(1);
        System.out.println(
                "ID=" + id +
                " POS=" + gps.currentPosition() +
                " MSG=" + message
        );
    }

    public String getDeviceId() {
        return id;
    }

    // GPS update
    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }

    public void showBattery() {
        System.out.println("Battery: " + battery.getLevel() + "%");
    }
}

/* ========= MAIN TEST ========= */

public class Main {
    public static void main(String[] args) {

        RescueRobot robot = new RescueRobot("RR-01");

        robot.updatePosition(13.7563, 100.5018);

        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        robot.startEngine();
        System.out.println("Max speed: " + robot.maxSpeed());
        robot.stopEngine();

        robot.readTemperatureC();
        robot.detectHuman(36.5);

        robot.send("Found hotspot...");

        robot.showBattery();
    }
}
