package gocycle.vehicle;
import gocycle.notifier.Notifier;
import gocycle.notifier.InAppNotifier;

/**
 * Represents an electric vehicle in the GoCycle system.
 * Extends the standard vehicle availability rules by
 * checking that the battery level is at least 20%.
 */
public abstract class ElectricVehicle extends Vehicle {

    private int currentBattery;

    /**
     * Creates an electric vehicle with an initial battery level.
     *
     * @param id the unique identifier for the vehicle
     * @param currentBattery the battery percentage (0 to 100)
     */
    public ElectricVehicle(String id, int currentBattery) {
        super(id);
        setCurrentBattery(currentBattery);
    }

    public int getCurrentBattery() {
        return currentBattery;
    }

    /**
     * Updates the battery level, ensuring it stays within
     * the valid percentage range.
     *
     * @param currentBattery the new battery percentage
     */
   public void setCurrentBattery(int currentBattery) {
    if (currentBattery < 0 || currentBattery > 100) {
        throw new IllegalArgumentException(
            "Battery level must be between 0 and 100."
        );
    }

    boolean lowBatteryReported = this.currentBattery < 20;

    this.currentBattery = currentBattery;

    if (currentBattery < 20 && !lowBatteryReported) {
        Notifier notifier = new InAppNotifier();

        String message = "Vehicle " + getId()
            + " has low battery (" + currentBattery + "%).";

        notifier.send(
            "[Maintenance Crew] " + message,
            "Maintenance Crew"
        );

        notifier.send(
            "[Control Room Operator] " + message,
            "Control Room Operator"
        );
    }
}

    /**
     * Checks both the standard vehicle requirements and
     * the minimum battery level needed for rental.
     *
     * @return true if the vehicle is available and has
     *         at least 20% battery, false otherwise
     */
    @Override
    public boolean isAvailable() {
        return super.isAvailable() && currentBattery >= 20;
    }
}