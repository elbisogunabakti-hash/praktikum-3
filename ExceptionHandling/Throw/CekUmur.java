package ExceptionHandling.Throw;

public class CekUmur{
   
    public void cekUmur(int umur) {
        if (umur < 18) {
            
            throw new ArithmeticException("Umur belum cukup (minimal 18 tahun).");
        } else {
            System.out.println("Umur valid, silakan lanjut.");
        }
    }
}
