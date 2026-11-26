public interface PaymentMethod {
    String name();

    long fee(long amount);

    boolean canPay(long amount);


}
