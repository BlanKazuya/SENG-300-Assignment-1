package gocycle.station;

public class DockingPoint {

    private boolean availabilityStatus;

    /**
     * Creates docking point that is initially available.
     */
    public DockingPoint() {
        this.availabilityStatus = true;
    }

    /**
     * Creates docking point with set status.
     * @param status Status of docking point.
     */
    public DockingPoint(boolean status){
        this.availabilityStatus = status;
    }

    public boolean isAvailable(){
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availability){
        availabilityStatus = availability;
    }
}
