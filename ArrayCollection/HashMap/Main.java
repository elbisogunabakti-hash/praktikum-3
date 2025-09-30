package ArrayCollection.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Makanan> menu = new HashMap<>();

       
        menu.put("nasi", new Makanan("Nasi Goreng", 15000));
        menu.put("mie", new Makanan("Mie Ayam", 12000));
        menu.put("sate", new Makanan("Sate Ayam", 20000));

        
        System.out.println(menu.get("nasi").getNama() + " : Rp" + menu.get("nasi").getHarga());
        System.out.println(menu.get("mie").getNama() + " : Rp" + menu.get("mie").getHarga());
        System.out.println(menu.get("sate").getNama() + " : Rp" + menu.get("sate").getHarga());
    }
}
