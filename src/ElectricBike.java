/**
 * Represents an electric bike in the GoCycle rental system.
 * Inherits battery management and rental availability
 * checks from ElectricVehicle.
 */
public class ElectricBike extends ElectricVehicle {

    /**
     * Creates an electric bike with an ID and battery level.
     *
     * @param id the unique identifier for the bike
     * @param currentBattery the initial battery percentage
     */
    public ElectricBike(String id, int currentBattery) {
        super(id, currentBattery);
    }
}
