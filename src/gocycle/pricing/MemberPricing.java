package gocycle.pricing;
import gocycle.domain.Money;
public class MemberPricing implements PricingPolicy {
    public String name() {
        return "Member";
    }

    public Money unlockFee() {
        return Money.ZERO;
    }
    public Money perMinute() {
        return Money.of("0.20"); // Half Price
    }
}
