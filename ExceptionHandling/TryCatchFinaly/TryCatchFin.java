package ExceptionHandling.TryCatchFinaly;

public class TryCatchFin {
    public static void main(String[] args) {
        try {
            
            int angka = 10;
            int hasil = angka / 0;   
            System.out.println("Hasil: " + hasil);
        } 
        catch (ArithmeticException e) {
          
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } 
        finally {
           
            System.out.println("Program selesai dieksekusi (blok finally).");
        }
    }
}
