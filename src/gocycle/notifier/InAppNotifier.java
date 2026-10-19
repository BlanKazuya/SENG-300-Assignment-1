package gocycle.notifier;

public class InAppNotifier implements Notifier{

    /**
     * Sends formatted receipt to rider.
     * @param receipt Formatted receipt.
     * @param riderID The rider's ID.
     */
    @Override
    public void send(String receipt, String riderID) {
        System.out.println(receipt);
    }
}
