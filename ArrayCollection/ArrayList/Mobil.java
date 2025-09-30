package ArrayCollection.ArrayList;

public class Mobil {
    private String merk;
    private String warna;

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void info() {
        System.out.println("Mobil " + merk + " - Warna: " + warna);
    }
}
