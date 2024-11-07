package Figuras;

public class F14 {
    public void DrawF14(int n){
        for (int i = 0; i < n; i++) {
            // Espacios iniciales para centrar el triángulo
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            int numero = 1;
            for (int c = 0; c <= i; c++) {
                System.out.print(numero + " ");
                // Calcula el siguiente número en la fila usando la relación del triángulo de Pascal
                numero = numero * (i - c) / (c + 1);
            }
            System.out.println();
        }
    }
}
