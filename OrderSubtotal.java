public class OrderSubtotal {
    public static void main(String[] args) {
        long[] prices = {250_000, 120_000, 45_000};
        int[] quantities = {2, 1, 3};

        if (prices.length != quantities.length) {
            throw new IllegalArgumentException("prices and quantities must have the same length");
        }

        long subtotal = 0;
        for (int i = 0; i < prices.length; i++) {
            long lineTotal = prices[i] * quantities[i];
            subtotal += lineTotal;
            System.out.println("Item " + (i + 1) + ": " + prices[i] + " x " + quantities[i] + " = " + lineTotal);
        }

        System.out.println("Subtotal: " + subtotal);
    }
}