/**
 * Tests the basic functionality of the GoCycle vehicle classes.
 */
public class VehicleTest {

    public static void main(String[] args) {

        // Create a pedal bike with a unique ID.
        PedalBike bike = new PedalBike("BIKE001");

        // Check that the bike's ID and availability are correct.
        System.out.println("Bike ID: " + bike.getId());
        System.out.println("Available: " + bike.isAvailable());

        // Test electric bike availability at different battery levels.
        ElectricBike lowBatteryBike = new ElectricBike("EBIKE001", 19);
        ElectricBike minimumBatteryBike = new ElectricBike("EBIKE002", 20);
        ElectricBike chargedBike = new ElectricBike("EBIKE003", 80);

        System.out.println("19% battery: " + lowBatteryBike.isAvailable());
        System.out.println("20% battery: " + minimumBatteryBike.isAvailable());
        System.out.println("80% battery: " + chargedBike.isAvailable());


        // Verify that invalid battery percentages are rejected.
        try {

            ElectricBike invalidBike = new ElectricBike("EBIKE004", -5);
            System.out.println("ERROR: Negative battery level was accepted.");
}       catch (IllegalArgumentException e) {
            System.out.println("Negative battery correctly rejected.");
}

        try {
            ElectricBike invalidBike = new ElectricBike("EBIKE005", 110);
            System.out.println("ERROR: Battery level above 100 was accepted.");
}       catch (IllegalArgumentException e) {
            System.out.println("Battery above 100 correctly rejected.");
}
    }
}

    
