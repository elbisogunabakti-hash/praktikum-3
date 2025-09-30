package ExceptionHandling.Throws;

public class Main {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        try {
            System.out.println("10 / 2 = " + calc.bagi(10, 2));
            System.out.println("5 / 0 = " + calc.bagi(5, 0)); 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah error ditangani.");
    }
}
