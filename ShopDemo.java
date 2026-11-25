public class ShopDemo {
    public static void main(String[] args) {
        Product shirt = new Product("Áo thun", 250_000);


        Product hat = new Product("hat", 20_000);


        System.out.println(shirt.getName() + " costs " + shirt.getPrice());
        System.out.println(hat.getName() + " costs " + hat.getPrice());

        System.out.println(shirt);
        System.out.println(hat);
    }
}
