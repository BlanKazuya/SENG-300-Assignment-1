package gocycle.paymentport;

/**
 * represents the adapter to use a phone wallet payment system
 * implements the PaymentPort interface
 */
public class PhoneWalletAdapter implements PaymentPort {

    private final PaymentClient client;
    private final PhoneWallet wallet;

    /**
     * creates the wrapper for the phone wallet
     */
    public PhoneWalletAdapter(PaymentClient client, PhoneWallet Wallet) {
        this.client = client;
        this.wallet = Wallet;
    }

    /**
     * Phone wallet payment implementation
     * @param id id of user
     * @param amount float amount of dollars charged to the user
     * @return true if payment went through, false if payment failed
     */
    @Override
    public boolean charge(String id, float amount) {
        return client.chargeCard(wallet,amount);
    }
}