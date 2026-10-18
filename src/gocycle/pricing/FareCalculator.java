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

    // Create a standard calculator:
    // Trips longer than 2 hours receive a $5 surcharge
    public static FareCalculator standard() {
        return new FareCalculator(
                Duration.ofHours(2),
                Money.of("5.00")
        );
    }


}
