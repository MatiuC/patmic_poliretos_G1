package Figuras;

import java.util.Scanner;

public class F4 {
    public void figura4() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt(); 
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) { // Espacios a la izquierda
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {// asteríscos
                System.out.print("*");
            }
            System.out.println(); // salto de línea
        }
    }
}
