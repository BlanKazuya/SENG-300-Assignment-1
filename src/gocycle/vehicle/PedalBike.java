package gocycle.vehicle;

/**
 * Represents a regular pedal bike in the GoCycle system.
 * Inherits the common vehicle properties and availability
 * checks from the Vehicle class.
 */
public class PedalBike extends Vehicle {

    /**
     * Creates a pedal bike with the specified ID.
     *
     * @param id the unique identifier for the bike
     */
    public PedalBike(String id) {
        super(id);
    }
}

