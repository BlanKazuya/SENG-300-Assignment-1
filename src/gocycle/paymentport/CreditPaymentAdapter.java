package gocycle.paymentport;

/**
 * Represents the adapter for using a credit card to pay
 * implements the PaymentPort interface
 */
class CreditPaymentAdapter implements PaymentPort {

    public CreditPaymentClient client;
    private CreditCard creditCard;

    /**
     * Creates a wrapper for credit card payments
     */
    public CreditPaymentAdapter(CreditPaymentClient client, CreditCard creditCard) {
        this.client = client;
        this.creditCard = creditCard;
    }
    /**
     * Credit card payment implementation
     * @param id user id of the user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    public boolean charge(String id, float amount) {
        client.chargeCard(creditCard, amount);
    }
}