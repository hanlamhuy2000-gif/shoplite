public class Product {
    private final String name;
    private final long price;

    public Product(String name, long price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name must not be blank, got: '" + name + "'");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative, got: " + price);
        }

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + price + " VND)";
    }

    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return this.price;
    }
}