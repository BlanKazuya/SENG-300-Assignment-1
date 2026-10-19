package gocycle.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Uses BigDecimal for better precision and accuracy since we are dealing with financial.
 * <br>
 * This assumes a single currency which is CAD($)
 * @param amount Amount of money
 */

public record Money(BigDecimal amount) {
    // Default Value of $0.00
    public static final Money ZERO = new Money(BigDecimal.ZERO);

    // Sets the value into string (ex. "$5.00")
    public static Money of(String value) {
        return new Money(new BigDecimal(value));
    }

    // Adds 2 different values together
    public Money plus (Money other) {
        return new Money(amount.add(other.amount));
    }

    // Multiplies your value by certain time. We are using minutes as our multiplier
    public Money times(long n) {
        return new Money(amount.multiply(BigDecimal.valueOf(n)));
    }

    // Sets value to have 2 digits after decimal and round up or down by .5
    @Override
    public String toString() {
        return "$" + amount.setScale(2, RoundingMode.HALF_UP);
    }

} // END OF THE CLASS
