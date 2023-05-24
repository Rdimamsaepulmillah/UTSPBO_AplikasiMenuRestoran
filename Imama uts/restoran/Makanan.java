package restoran;

// Subclass: Makanan
public class Makanan extends Menu {
    private boolean pedas;

    public Makanan(String nama, double harga, boolean pedas) {
        super(nama, harga);
        this.pedas = pedas;
    }

    public Makanan(String nama, double harga) {
        super(nama, harga);
    }

    public boolean isPedas() {
        return pedas;
    }
}