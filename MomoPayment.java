public class MomoPayment implements PaymentMethod {
    @Override
    public String name() {
        return "MoMo";
    }

    @Override
    public long fee(long amount) {
        return 1_000;
    }

    @Override
    public boolean canPay(long amount) {
        return true;
    }
}
