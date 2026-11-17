public class PriceCalculator {
    public static void main(String[] args) {
        String productName = "Áo thun";
        int quantity = 3;
        long unitPrice = 250_000;

        final long VAT_PERCENT = 10;
        final long SHIPPING_FEE = 30_000;
        long shipping = SHIPPING_FEE;
        long subtotal = unitPrice * quantity;
        long vat = (subtotal * VAT_PERCENT + 50) / 100;
        long total = subtotal + vat + shipping;

        System.out.println("Product:   " + productName + " x " + quantity);
        System.out.println("Subtotal:  " + subtotal + " VND");
        System.out.println("VAT (" + VAT_PERCENT + "%): " + vat + " VND");
        System.out.println("Shipping:  " + shipping + " VND");
        System.out.println("TOTAL:     " + total + " VND");
    }
}
