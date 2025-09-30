package packageimport.laptop;

public class Laptop {
    public String merk;
    public String warna;
    
    public Laptop(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }
    
    public void info() {
        System.out.println("Laptop " + merk + " - Warna: " + warna);
    }
}