package gocycle.paymentport;

/**
 * Represents the adapter for using a credit card to pay
 * implements the PaymentPort interface
 */
public class CreditPaymentAdapter implements PaymentPort {

    private final PaymentClient client;
    private final CreditCard creditCard;

    /**
     * Creates a wrapper for credit card payments
     */
    public CreditPaymentAdapter(PaymentClient client, CreditCard creditCard) {
        this.client = client;
        this.creditCard = creditCard;
    }
    /**
     * Credit card payment implementation
     * @param id user id of the user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    @Override
    public boolean charge(String id, float amount) {
        return client.chargeCard(creditCard, amount);
    }
}