package Recusion;
import java.util.Scanner;

public class R02 {

    public int g1_suma(int a, int b) {
        if (b == 0) {
            return a;
        }
        return g1_suma(a + 1, b - 1);
    }

    public void leerYSumar() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int resultado = g1_suma(a, b);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }
}
