public class CashChange {
    public static void main(String[] args) {
        long price = 997_000;
        long paid = 1000_000;

        long change = paid - price;
        if (change < 0) {
            throw new IllegalArgumentException("Customer paid " + paid + " but price is " + price);
        }
        long[] notes = {100_000, 50_000, 20_000, 10_000, 5_000};

        System.out.println("Change: " + change);

        long remaining = change;

        for (int i = 0; i < notes.length; i++) {
            long count = remaining / notes[i];            // how many of notes[i] fit into remaining?
            remaining = remaining % notes[i];
            //what's left after taking them out?
            if (count > 0) {                   // only print notes that are actually given
                System.out.println(notes[i] + " x " + count);
            }
        }
        if (remaining > 0) {
            throw new IllegalStateException("Cannot dispense exact change. Remaining unpaid amount: " + remaining + " VND");
        }
    }
}
