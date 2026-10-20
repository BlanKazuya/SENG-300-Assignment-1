package gocycle.paymentport;
/**
 *This is the interface for the different payment options that a user can use
 */
public interface PaymentPort {
    /**
     * Charges the user through a third party client
     * @return true if payment went through, false if payment failed
     */
    boolean charge(String id, float amount);

}