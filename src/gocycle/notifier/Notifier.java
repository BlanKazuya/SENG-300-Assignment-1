package gocycle.notifier;

public interface Notifier {
    void send(String message, String recipient);
}
