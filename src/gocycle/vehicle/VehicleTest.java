
package gocycle.vehicle;

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

        // Test electric scooter availability at different battery levels.
ElectricScooter lowBatteryScooter = new ElectricScooter("SCOOTER001", 15);
ElectricScooter chargedScooter = new ElectricScooter("SCOOTER002", 75);

System.out.println("Scooter at 15%: " + lowBatteryScooter.isAvailable());
System.out.println("Scooter at 75%: " + chargedScooter.isAvailable());

  
    // Test that reporting a fault prevents a pedal bike from being rented.
PedalBike maintenanceBike = new PedalBike("BIKE002");

maintenanceBike.reportFault();
System.out.println("Bike after fault: " + maintenanceBike.isAvailable());
System.out.println("Needs maintenance: " + maintenanceBike.needsMaintenance());

// Test that a repaired bike becomes available again.
maintenanceBike.completeMaintenance();
System.out.println("Bike after repair: " + maintenanceBike.isAvailable());

// Test that manually disabling a vehicle prevents rental.
maintenanceBike.setAvailability(false);
System.out.println("Bike disabled: " + maintenanceBike.isAvailable());

// Test that a low-battery electric bike remains unavailable after repairs.
ElectricBike maintenanceElectricBike = new ElectricBike("EBIKE006", 15);

maintenanceElectricBike.reportFault();
maintenanceElectricBike.completeMaintenance();

System.out.println("Low battery after repair: "
        + maintenanceElectricBike.isAvailable());




    }
}

    
