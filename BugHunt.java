public class BugHunt {
    static long sumOfPrices(long[] prices) {
        long total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public static void main(String[] args) {
        long[] cart = {250_000, 120_000, 45_000};
        System.out.println("Expected 415000, got " + sumOfPrices(cart));
    }
}