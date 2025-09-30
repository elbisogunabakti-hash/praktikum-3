package packageimport.laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "Hitam");
        Laptop laptop2 = new Laptop("Lenovo", "Silver");
        
        laptop1.info();
        laptop2.info();
    }
}