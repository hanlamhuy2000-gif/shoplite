public class ZaloPayPayment implements PaymentMethod {
    private static final long FEE_PERCENT = 15;
    private static final long MAX_AMOUNT = 50_000_000;

    @Override
    public String name() {
        return "ZaloPay";
    }

    @Override
    public long fee(long amount) {
        return PriceCalculator.perMilleOfRounded(amount, FEE_PERCENT);
    }

    @Override
    public boolean canPay(long amount) {
        return amount <= MAX_AMOUNT;
    }
}
