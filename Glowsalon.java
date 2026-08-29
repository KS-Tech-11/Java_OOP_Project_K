public class GlowSalon {

    // works out the price after applying whatever discount applies to that service
    public static double calculateSubtotal(int index, double price, int quantity) {
        double subtotal = price * quantity;

        if (index == 0 && quantity >= 3) {
            // haircut - give 5% off if they're getting 3 or more
            subtotal *= 0.95;
        } else if (index == 2 && quantity >= 2) {
            // manicure - flat 3000 off for 2+
            subtotal -= 3000;
        } else if (index == 3 && quantity >= 2) {
            // braiding - 10% off for 2+
            subtotal *= 0.90;
        }

        return subtotal;
    }
