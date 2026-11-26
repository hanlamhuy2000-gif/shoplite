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

        new Customer("   ", "a@b.com", "GOLD");          // blank name
        //new Customer("Lan", "lan.gmail.com", "GOLD");    // email without @
        // new Customer("Lan", "lan@gmail.com", "DIAMOND"); // unknown tier
    }
}
