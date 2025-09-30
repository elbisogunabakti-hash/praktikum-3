package ArrayCollection.Array;

public class Array {
    public static void main(String[] args) {
        String[] matkul = new String[3];

        matkul[0] = "Pemrograman Dasar";
        matkul[1] = "Struktur Data";
        matkul[2] = "Basis Data";

        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Mata kuliah ke-" + (i + 1) + ": " + matkul[i]);
        }
    }
}