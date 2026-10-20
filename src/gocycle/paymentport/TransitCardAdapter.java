package gocycle.paymentport;

/**
 * Represents the adapter for transit card payment
 * implements the PaymentPort interface
 */
class TransitCardAdapter implements PaymentPort {

    public TransitCardClient client;
    private TransitCard tranistCard;

    /**
     * creates a wrapper for transit card payments
     * @param transitCard the transit card information
     */
    public TransitCardAdapter(TransitCardClient client, TranistCard transitCard) {
        this.client = client;
        this.tranistCard = transitCard;
    }
    /**
     * Transit card payment implementation
     * @param id user id of the user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    public boolean charge(String id, float amount) {
        client.chargeCard(tranistCard, amount);
    }
}