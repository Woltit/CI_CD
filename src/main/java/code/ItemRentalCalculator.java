package code;

/**
 * Calculator for rental items.
 */
public final class ItemRentalCalculator {

    /** * Threshold in days to apply a discount.
     */
    private static final int DISCOUNT_DAYS_THRESHOLD = 7;

    /** * The discount rate applied to the total rent.
     */
    private static final double DISCOUNT_RATE = 0.85;

    /**
     * Calculates the rent price based on days and daily rate.
     *
     * @param pricePerDay the price for one day of rent
     * @param days        the number of rental days
     * @return the calculated total rent price
     */
    public double calculateRent(final double pricePerDay, final int days) {
        if (days > DISCOUNT_DAYS_THRESHOLD) {
            return pricePerDay * days * DISCOUNT_RATE;
        }
        return pricePerDay * days;
    }

    /**
     * Checks if the promotion system is currently active.
     *
     * @return true if active, false otherwise
     */
    public boolean isPromotionSystemActive() {
        return true;
    }
}
