package gocycle.formatter;

public class ReportFormatter implements Formatter{
    @Override
    public String format(String vehicleID, String stationID) {
        return ("Fault reported @ station " + stationID + ":\nVehicle: " + vehicleID);
    }
}
