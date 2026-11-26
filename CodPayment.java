public class CodPayment implements PaymentMethod {
    private static final long FEE = 15_000;
    private static final long MAX_AMOUNT = 2_000_000;

    @Override
    public String name() {
        return "COD";
    }

    @Override
    public long fee(long amount) {
        return FEE;
    }

    @Override
    public boolean canPay(long amount) {
        return amount <= MAX_AMOUNT;
    }
}
