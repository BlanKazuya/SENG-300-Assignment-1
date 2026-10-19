package gocycle.notifier;

public class ReportNotifier implements Notifier{

    /**
     * Sends formatted report message to crew.
     * @param report Report message.
     * @param crewID The crew ID.
     */
    @Override
    public void send(String report, String crewID) {
        System.out.println(report);
    }
}
