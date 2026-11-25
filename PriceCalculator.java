public class PriceCalculator {
    static final long FREE_SHIPPING_THRESHOLD = 500_000;
    static final long VAT_PERCENT = 10;
    static final long SHIPPING_FEE = 30_000;

    static long discountPercentFor(String tier) {
        return switch (tier) {
            case "NONE" -> 0;
            case "SILVER" -> 5;
            case "GOLD" -> 10;
            case "PLATINUM" -> 15;
            default -> throw new IllegalArgumentException("Unknown member tier: " + tier);
        };
    }

    static long percentOfRounded(long amount, long percent) {
        return (amount * percent + 50) / 100;
    }

    static long calculateTotal(Product product, int quantity, String tier) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity cant be zero or below");
        }

        long subtotal = product.getPrice() * quantity;
        long discountPercent = discountPercentFor(tier);
        long discount = percentOfRounded(subtotal, discountPercent);
        long discountedSubtotal = subtotal - discount;

// Business rule (PM confirmed): threshold applies to the DISCOUNTED subtotal
        long shipping;
        if (discountedSubtotal >= FREE_SHIPPING_THRESHOLD) {
            shipping = 0;
        } else {
            shipping = SHIPPING_FEE;
        }
        long vat = percentOfRounded(discountedSubtotal, VAT_PERCENT);

        return discountedSubtotal + vat + shipping;
    }

    static void check(String testName, long expected, long actual) {
        if (expected == actual) {
            System.out.println("PASS  " + testName);
        } else {
            System.out.println("FAIL  " + testName + ": expected " + expected + " but got " + actual);
        }
    }

    public static void main(String[] args) {
        check("Test 1: NONE, 750k", 825_000, calculateTotal(new Product("Áo thun", 250_000), 3, "NONE"));
        check("Test 2: GOLD, 500k", 525_000, calculateTotal(new Product("Áo thun", 250_000), 2, "GOLD"));
        check("Test 3: NONE, boundary", 550_000, calculateTotal(new Product("Áo thun", 100_000), 5, "NONE"));
        check("Test 4: PLATINUM rounding", 41_542, calculateTotal(new Product("Áo thun", 12_345), 1, "PLATINUM"));
        check("Test 5: SILVER, free shipping after discount", 627_000, calculateTotal(new Product("Áo thun", 200_000), 3, "SILVER"));
    }
}
