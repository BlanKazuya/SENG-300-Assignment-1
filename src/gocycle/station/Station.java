package gocycle.station;

public class Station {
    private String id;
    private int maxDockingPoints;
    private DockingPoint[] list;

    /**
     * Creates station with all free docking points.
     * @param id Station id.
     * @param maxDockingPoints Number of docking points at station.
     */
    public Station(String id, int maxDockingPoints){
        this.id = id;
        this.maxDockingPoints = maxDockingPoints;
        this.list = new DockingPoint[maxDockingPoints];
        for (int i=0; i < maxDockingPoints; i++){
            list[i] = new DockingPoint();
        }
    }

    /**
     * Creates station with already used docking points.
     * @param id Station id.
     * @param maxDockingPoints Number of docking points at station.
     * @param usedDockingPoints Number of docking points currently used.
     */
    public Station(String id, int maxDockingPoints, int usedDockingPoints){
        this.id = id;
        this.maxDockingPoints = maxDockingPoints;
        this.list = new DockingPoint[maxDockingPoints];
        for (int i=0; i < maxDockingPoints; i++){
            if (i<usedDockingPoints){list[i] = new DockingPoint(false);}
            else {list[i] = new DockingPoint();}
        }
    }

    /**
     * Grab a station id.
     * @return Station id as a string.
     */
    public String getId(){
        return id;
    }

    /**
     * Method to see how many available docking points are in a station.
     * @return Number of available docking points.
     */
    public int getAvailableDockingPoints(){
        int sum = 0;
        for (int i=0; i < maxDockingPoints; i++){
            if (list[i].isAvailable()) {sum++;}
        }
        return sum;
    }

    /**
     * Switches an unavailable DockingPoint to available.
     */
    public void pull(){
        if (!isEmpty()){
            for (int i=0; i < maxDockingPoints; i++){
                if (!list[i].isAvailable()){
                    list[i].setAvailabilityStatus(true);
                    return;
                }
            }
        }
        System.out.println("Station is empty, no vehicle to borrow.");
    }

    /**
     * Switches an available DockingPoint to unavailable.
     */
    public void park(){
        if (!isFull()){
            for (int i=0; i < maxDockingPoints; i++){
                if (list[i].isAvailable()){
                    list[i].setAvailabilityStatus(false);
                    return;
                }
            }
        }
        System.out.println("Station is full, cannot park.");
    }

    /**
     * Checks if a station is full.
     * @return True if station is full, False otherwise.
     */
    public boolean isFull(){
        return (getAvailableDockingPoints()==0);
    }

    /**
     * Checks if a station is empty.
     * @return True if station is empty, False otherwise.
     */
    public boolean isEmpty() {return (getAvailableDockingPoints()==maxDockingPoints);}
}
