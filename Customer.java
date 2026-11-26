public class Customer {
    private final String name;
    private final String email;
    private final String tier;

    public Customer(String name, String email, String tier) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name must not be blank, got: '" + name + "'");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@', got: '" + email + "'");
        }

        if (tier == null) {
            throw new IllegalArgumentException("Unknown member tier: '" + tier + "'");
        }
        switch (tier) {
            case "NONE", "GOLD", "SILVER", "PLATINUM" -> {
            }
            default -> throw new IllegalArgumentException("Unknown member tier: '" + tier + "'");
        }
        this.name = name;
        this.email = email;
        this.tier = tier;
    }

    @Override
    public String toString() {
        return name + " (" + tier + ")";
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTier() {
        return this.tier;
    }
}
