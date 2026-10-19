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

    public String getId(){
        return id;
    }

    public int getAvailableDockingPoints(){
        int sum = 0;
        for (int i=0; i < maxDockingPoints; i++){
            if (list[i].isAvailable()) {sum++;}
        }
        return sum;
    }
}
