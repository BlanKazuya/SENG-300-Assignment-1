package gocycle.paymentport;

/**
 * represents the adapter to use a phone wallet payment system
 * implements the PaymentPort interface
 */
class PhoneWalletAdapter implements PaymentPort {

    public PhoneWalletClient client;

    /**
     * creates the wrapper for the phone wallet
     */
    public PhoneWallentAdapter(PhoneWalletClient client) {
        this.client = client;
    }

    /**
     * Phone wallet payment implementation
     * @param id id of user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    public boolean charge(String id, float amount) {
        client.chargephone(amount);
    }
}