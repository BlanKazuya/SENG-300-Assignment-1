package gocycle.station;

public class DockingPoint {

    private boolean availabilityStatus;

    /**
     * Creates docking point that is initially available.
     */
    public DockingPoint() {
        this.availabilityStatus = true;
    }

    public boolean isAvailable(){
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availability){
        availabilityStatus = availability;
    }
}
