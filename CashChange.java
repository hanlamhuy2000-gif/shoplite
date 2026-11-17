public class CashChange {
    public static void main(String[] args) {
        long price = 940_000;
        long paid = 1_000_000;

        long change = paid - price;
        long remaining = change;

        long oneHundredBill = change / 100_000;
        remaining = change % 100_000;

        long fiftyBill = remaining / 50_000;
        remaining = remaining % 50_000;

        long twentyBill = remaining / 20_000;
        remaining = remaining % 20_000;

        long tenBill = remaining / 10_000;
        remaining = remaining % 10_000;

        long fiveBill = remaining / 5_000;
        remaining = remaining % 5_000;

        System.out.println("Change: " + change);
        System.out.println("100000 x " + oneHundredBill);
        System.out.println("50000 x " + fiftyBill);
        System.out.println("20000 x " + twentyBill);
        System.out.println("10000 x " + tenBill);
        System.out.println("5000 x " + fiveBill);

    }
}
