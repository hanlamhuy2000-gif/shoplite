public class InstallmentPlan {
    public static void main(String[] args) {
        long balance = 900_000;
        final long MONTHLY_PAYMENT = 0;
        int count = 0;
        if (MONTHLY_PAYMENT <= 0) {
            throw new IllegalArgumentException("Monthly payment must be greater than 0.");
        }
        while (balance > 0) {
            long payment = Math.min(MONTHLY_PAYMENT, balance);
            balance -= payment;
            count++;
            System.out.println("Month " + count + ": paid " + payment + ", remaining " + balance);
        }

    }
}
