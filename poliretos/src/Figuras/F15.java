package Figuras;

public class F15 {
public void figura15(int c) {
        System.out.println("Pirámide con números: ");
        for (int i = 0; i < c; i++) {
            int valor = 1; // El primer número de cada fila es siempre 1
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " "); // Imprimir el valor actual
                valor = valor * (i - j) / (j + 1); // Calcular el siguiente valor en la fila
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
