package gocycle;

import java.time.LocalTime;
import gocycle.station.*;

public class Trip {
    private Rider rider;
    private LocalTime startTime;
    private LocalTime endTime;
    private Station startStation;
    private Station endStation;
    private LocalTime diffTime;

    public Trip(Rider rider, Station startStation) {
        this.rider = rider;
        this.startStation = startStation;
        this.startTime = LocalTime.now();
        this.diffTime = startTime.plusHours(2);
    }

    /**
     * Returns trip time measured in minutes.
     * @return Trip time (minutes).
     */
    public int getTripTime(){
        LocalTime timeNow = LocalTime.now();
        LocalTime elapsedTime = timeNow.minusNanos(startTime.toNanoOfDay());
        return ((elapsedTime.getHour()*60) + elapsedTime.getMinute());
    }

    public boolean tripIsEnded(){
        return (endTime!=null);
    }

    /**
     * Ends trip, and checks if trip was >2 hours.
     * @param endStation Tracks end station.
     * @return True if trip <=2 hours, False if trip >2 hours.
     */
    public boolean endTrip(Station endStation){
        endTime = LocalTime.now();
        this.endStation = endStation;
        return (!endTime.isAfter(diffTime));
    }
}
