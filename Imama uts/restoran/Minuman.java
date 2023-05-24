package restoran;

// Subclass: Minuman
public class Minuman extends Menu {
    private boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    public Minuman(String nama, double harga) {
        super(nama, harga);
    }

    public boolean isDingin() {
        return dingin;
    }
}