package gocycle.notifier;

public class EmailNotifier implements Notifier{

    //represents email client
    EmailClient client;

    /**
     * Uses email client to send receipt to rider via email.
     * @param receipt receipt in string form
     * @param riderEmail the riders email address
     */
    @Override
    public void send(String receipt, String riderEmail) {
        client.send(receipt, "GoCycle Receipt", riderEmail);
    }
}
