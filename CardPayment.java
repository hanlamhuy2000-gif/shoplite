public class CardPayment implements PaymentMethod {
    private static final long FEE_PERCENT = 2;

    @Override
    public String name() {
        return "Card";
    }

    @Override
    public long fee(long amount) {
        return PriceCalculator.percentOfRounded(amount, FEE_PERCENT);
    }

    @Override
    public boolean canPay(long amount) {
        return true;
    }


}
