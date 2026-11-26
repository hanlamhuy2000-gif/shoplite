public class ShopDemo {
    public static void main(String[] args) {
        Product shirt = new Product("Áo thun", 250_000);


        Product hat = new Product("hat", 20_000);


        System.out.println(shirt.getName() + " costs " + shirt.getPrice());
        System.out.println(hat.getName() + " costs " + hat.getPrice());

        System.out.println(shirt);
        System.out.println(hat);

        Customer thuy = new Customer("Thuy", "water@gmail.com", "GOLD");
        Customer hoa = new Customer("Hoa", "fire@gmail.com", "NONE");


        System.out.println(thuy);
        System.out.println(hoa);


        Product shirt1 = new Product("Áo thun", 250_000);
        Product shirt2 = new Product("Áo thun", 250_000);
        System.out.println(shirt1 == shirt2);
        System.out.println(shirt1.equals(shirt2));

        System.out.println("--- payment options ---");
        long total = 3_000_000;

        PaymentMethod[] methods = {new CardPayment(), new MomoPayment(), new CodPayment()};

        for (int i = 0; i < methods.length; i++) {
            PaymentMethod method = methods[i];
            System.out.println(method.name() + ": fee " + method.fee(total) + ", available: " + method.canPay(total));
        }
    }
}
