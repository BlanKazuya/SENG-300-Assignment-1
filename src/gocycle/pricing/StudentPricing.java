package gocycle.pricing;

import gocycle.domain.Money;

public class StudentPricing implements PricingPolicy{
    public String name() {
        return "Casual";
    }

    public Money unlockFee() {
        return Money.of("1.00");
    }
    public Money perMinute() {
        return Money.of("0.40");
    }
}
