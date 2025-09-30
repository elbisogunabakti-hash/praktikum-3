package ExceptionHandling.Throws;

public class Kalkulator {
    
    public int bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!");
        }
        return a / b;
    }
}
