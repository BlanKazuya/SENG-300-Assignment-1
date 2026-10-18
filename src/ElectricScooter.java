/**
 * Represents an electric scooter in the GoCycle rental system.
 * Inherits battery management and availability checks
 * from the ElectricVehicle class.
 */
public class ElectricScooter extends ElectricVehicle {

    /**
     * Creates an electric scooter with an ID and battery level.
     *
     * @param id the unique identifier for the scooter
     * @param currentBattery the initial battery percentage
     */
    public ElectricScooter(String id, int currentBattery) {
        super(id, currentBattery);
    }
}