package gocycle.pricing;

import gocycle.domain.Money;
import java.time.Duration;

/**
 * Calculates a trip's fare using an unlock fee,
 * a per-minute charge, and an optional long-trip surcharge.
 * It does not need to know who the rider is.
 */

public class FareCalculator {
    // The minimum trip duration that triggers the surcharge
    private final Duration longTripThreshold;

    // The extra amount charged for a long trip
    private final Money longTripSurcharge;

    public FareCalculator(Duration longTripThreshold, Money longTripSurcharge) {
        this.longTripThreshold = longTripThreshold;
        this.longTripSurcharge = longTripSurcharge;
    }

    // Creates a standard calculator:
    // Trips longer than 2 hours receive a $5 surcharge
    public static FareCalculator standard() {
        return new FareCalculator(
                Duration.ofHours(2),
                Money.of("5.00")
        );
    }

    /**
     * @param policy What type of Rider is it? (Casual, Member, or Student)
     * @param tripLength How long is the trip in minutes?
     * @return total price for the trip depending on your role
     */
    public Money fare(PricingPolicy policy, Duration tripLength) {

        // Round up to the next whole minute
        long minutes = (tripLength.getSeconds() + 59) / 60;

        // Calculate the unlock fee plus the per-minute charge
        Money total = policy.unlockFee().plus(policy.perMinute().times(minutes));

        // Add the surcharge if the trip exceeds the threshold
        if (tripLength.compareTo(longTripThreshold) > 0) {
            total = total.plus(longTripSurcharge);
        }

        // Return the final fare
        return total;
    }
}
