package gocycle.vehicle;


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

    /**
     * Marks the vehicle as requiring maintenance.
     * A vehicle needing repairs cannot be rented.
     */
    public void reportFault() {
        maintenanceStatus = true;
    }

    /**
     * Marks the vehicle as repaired and ready for service.
     * Does not automatically change its rental availability status.
     */
    public void completeMaintenance() {
        maintenanceStatus = false;
    }

    /**
     * Updates whether the vehicle is available for rental.
     *
     * @param available true to make the vehicle available,
     *                  false to make it unavailable
     */
    public void setAvailability(boolean available) {
        availabilityStatus = available;
    }

    /**
     * Checks whether the vehicle currently requires maintenance.
     *
     * @return true if maintenance is required, false otherwise
     */
    public boolean needsMaintenance() {
        return maintenanceStatus;
    }
}
