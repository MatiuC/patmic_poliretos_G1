package Figuras;

public class F4 {
    public void figura4(int c) {
        System.out.print("Figura triángulo hacia la izquierda: ");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c - i; j++) { // Espacios a la izquierda
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {// asteríscos
                System.out.print("*");
            }
            System.out.println(); // salto de línea
        }
    }
}
