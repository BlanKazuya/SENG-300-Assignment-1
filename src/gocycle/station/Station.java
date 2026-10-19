package gocycle.station;

public class Station {
    private String id;
    private int maxDockingPoints;
    private DockingPoint[] list;

    public Station(String id, int maxDockingPoints){
        this.id = id;
        this.maxDockingPoints = maxDockingPoints;
        this.list = new DockingPoint[maxDockingPoints];
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
}
