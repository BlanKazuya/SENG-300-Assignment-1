package gocycle;

import java.time.LocalDateTime;
import java.time.LocalTime;
import gocycle.station.*;

public class Trip {
    private Rider rider;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Station startStation;
    private Station endStation;
    private LocalDateTime diffTime;

    public Trip(Rider rider, Station startStation) {
        this.rider = rider;
        this.startStation = startStation;
        this.startTime = LocalDateTime.now();
        this.diffTime = startTime.plusHours(2);
    }

    /**
     * Returns trip time measured in minutes.
     * @return Trip time (minutes).
     */
    public int getTripTime(){
        LocalDateTime timeNow = LocalDateTime.now();
        if (timeNow.getDayOfMonth()==startTime.getDayOfMonth()){
            LocalTime elapsedTime = timeNow.toLocalTime().minusNanos(startTime.toLocalTime().toNanoOfDay());
            return ((elapsedTime.getHour()*60) + elapsedTime.getMinute());
        }
        int elapsedHour = timeNow.getHour()+24-startTime.getHour();
        int elapsedMin = timeNow.getMinute()-startTime.getMinute();
        return ((elapsedHour*60) + elapsedMin);
    }

    /**
     * Checks if a trip has ended.
     * @return True if trip is ended, False if trip hasn't ended.
     */
    public boolean tripIsEnded(){
        return (endTime!=null);
    }

    /**
     * Ends trip, and checks if trip was >2 hours.
     * @param endStation Tracks end station.
     * @return True if trip <=2 hours, False if trip >2 hours.
     */
    public boolean endTrip(Station endStation){
        endTime = LocalDateTime.now();
        this.endStation = endStation;
        return (!endTime.isAfter(diffTime));
    }
}
