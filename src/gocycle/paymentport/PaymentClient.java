package gocycle.paymentport;

public class PaymentClient {
    public boolean chargeCard(CreditCard creditCard, float amount) {

        // Check whether the amount is valid
        if (amount <= 0) {
            return false;
        }

        // Simulate a successful payment
        System.out.println("Charging credit card $" + amount);

        return true;
    }

    public boolean chargeCard(PhoneWallet wallet, float amount) {

        // Check whether the amount is valid
        if (amount <= 0) {
            return false;
        }

        // Simulate a successful payment
        System.out.println("Charging wallet $" + amount);

        return true;
    }

    public boolean chargeCard(TransitCard card, float amount) {

        // Check whether the amount is valid
        if (amount <= 0) {
            return false;
        }

        // Simulate a successful payment
        System.out.println("Charging transit card $" + amount);

        return true;
    }

}
