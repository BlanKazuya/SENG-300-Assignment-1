package gocycle.formatter;

public class ReceiptFormatter implements Formatter{
    @Override
    public String format(String tripID, String cost) {
        return "Trip #ID: " + tripID + "\nTotal: " + cost +"\nTrip successful!\n";
    }
}
