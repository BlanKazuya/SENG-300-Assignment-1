package gocycle.formatter;

public class ReportFormatter implements Formatter{
    @Override
    public String format(String vehicleID) {
        return ("Fault reported with vehicle " + vehicleID);
    }
}
