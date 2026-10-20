package gocycle;

import java.time.LocalTime;
import gocycle.station.*;

public class Trip {
    private Rider rider;
    private LocalTime startTime;
    private LocalTime endTime;

    public Trip(Rider rider, Station startStation) {
        this.startTime = LocalTime.now();

    }

    public boolean tripIsEnded(){
        return (endTime!=null);
    }
}
