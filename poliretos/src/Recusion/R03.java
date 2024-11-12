package Recusion;

import java.util.Scanner;

public class R03 {

    public int g1_multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        return a + g1_multiplicacion(a, b - 1);
    }

    public void leerYMultiplicar() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int resultado = g1_multiplicacion(a, b);
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
    }
}
