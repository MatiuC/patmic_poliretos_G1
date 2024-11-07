package Recusion;

public class R01 {
  public long factorial(int n) {
      if (n < 0) {
          throw new IllegalArgumentException("El número no puede ser negativo");
      }
      return calcularFactorial(n);
  }
  
  private long calcularFactorial(int n) {
      if (n == 0 || n == 1) {
          return 1;
      }
      return n * calcularFactorial(n - 1);
  }
}