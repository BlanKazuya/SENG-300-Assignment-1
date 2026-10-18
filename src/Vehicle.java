/**
 * Represents a vehicle in the GoCycle rental system.
 * Stores information shared by all vehicle types,
 * including availability and maintenance status.
 */
public abstract class Vehicle {

    private String id;
    private boolean maintenanceStatus;
    private boolean availabilityStatus;

    /**
     * Creates a vehicle that is initially available
     * and does not require maintenance.
     */
    public Vehicle(String id) {
        this.id = id;
        this.maintenanceStatus = false;
        this.availabilityStatus = true;
    }

    public String getId() {
        return id;
    }

    /**
     * Checks whether the vehicle can be rented.
     * A vehicle must be available and not require maintenance.
     *
     * @return true if the vehicle can be rented, false otherwise
     */
    public boolean isAvailable() {
        return availabilityStatus && !maintenanceStatus;
    }
}
