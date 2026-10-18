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
    }
}
