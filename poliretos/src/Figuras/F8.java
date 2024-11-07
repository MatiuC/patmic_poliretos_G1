package Figuras;

import java.util.Scanner;

public class F8 {
public void figura8() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de escalones: ");
        int escalones = scanner.nextInt();
        for (int i = 1; i <= escalones; i++) {// Imprimir escalones desde el lado derecho
            for (int j = escalones; j > i; j--) {        // Espacios para alinear el escalón en diagonal desde la derecha
                System.out.print("     ");
            }
            System.out.println("___"); // Imprimir la línea horizontal del escalón
            for (int j = escalones; j > i; j--) {// Espacios para alinear el soporte vertical desde la derecha
                System.out.print("     ");
            }
            System.out.println("|    ");            // Imprimir el soporte vertical del escalón
        }
    }
}
