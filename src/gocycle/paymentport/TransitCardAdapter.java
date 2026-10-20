package gocycle.paymentport;

/**
 * Represents the adapter for transit card payment
 * implements the PaymentPort interface
 */
public class TransitCardAdapter implements PaymentPort {

    private final PaymentClient client;
    private final TransitCard transitCard;

    /**
     * creates a wrapper for transit card payments
     * @param transitCard the transit card information
     */
    public TransitCardAdapter(PaymentClient client, TransitCard transitCard) {
        this.client = client;
        this.transitCard = transitCard;
    }
    /**
     * Transit card payment implementation
     * @param id user id of the user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    @Override
    public boolean charge(String id, float amount) {
        return client.chargeCard(transitCard, amount);
    }
}