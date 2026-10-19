package gocycle.notifier;

//represents email client
public class EmailClient {

    /**
     *
     * @param message What the message is.
     * @param to Who the message sends to.
     */
    public void send(String message, String subject, String to){
        System.out.println("To: " + to + "\n\nSUBJECT: " + subject + "\n" + message);
    }
}
