package gocycle.station;

public class DockingPoint {

    public DockingPoint() {
    }

    private boolean availabilityStatus;

    public boolean isAvailable(){
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availability){
        availabilityStatus = availability;
    }
}
