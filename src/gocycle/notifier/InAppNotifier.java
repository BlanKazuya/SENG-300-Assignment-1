package gocycle.notifier;

public class InAppNotifier implements Notifier{

    /**
     * Sends formatted message to recipient.
     * @param message Formatted receipt.
     * @param recipient The recipient.
     */
    @Override
    public void send(String message, String recipient) {
        System.out.println("To " + recipient + ":\n" + message);
    }
}
