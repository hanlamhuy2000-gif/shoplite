public class PriceCalculator {
    public static void main(String[] args) {
        String memberTier = "PLATINUM";

        String productName = "Áo thun";
        int quantity = 1;
        long unitPrice = 12_345;

        final long FREE_SHIPPING_THRESHOLD = 500_000;
        final long VAT_PERCENT = 10;
        final long SHIPPING_FEE = 30_000;

        long shipping = 0;
        long subtotal = unitPrice * quantity;

        long discountPercent = switch (memberTier) {
            case "NONE" -> 0;
            case "SILVER" -> 5;
            case "GOLD" -> 10;
            case "PLATINUM" -> 15;
            default -> throw new IllegalArgumentException("Unknown member tier: " + memberTier);
        };

        long discount = (subtotal * discountPercent + 50) / 100;
        long discountedSubtotal = subtotal - discount;

        // Business rule (PM confirmed): threshold applies to the DISCOUNTED subtotal
        if (discountedSubtotal >= FREE_SHIPPING_THRESHOLD) {
            shipping = 0;
        } else {
            shipping = SHIPPING_FEE;
        }


        long vat = (discountedSubtotal * VAT_PERCENT + 50) / 100;
        long total = discountedSubtotal + vat + shipping;


        System.out.println("Subtotal:  " + subtotal + " VND");
        System.out.println("Discount  (" + discountPercent + "%):" + "-" + discount + " VND");
        System.out.println("After discount:  " + discountedSubtotal + " VND");
        System.out.println("VAT (" + VAT_PERCENT + "%): " + vat + " VND");
        System.out.println("Shipping:  " + shipping + " VND");
        System.out.println("TOTAL:     " + total + " VND");
    }
}
