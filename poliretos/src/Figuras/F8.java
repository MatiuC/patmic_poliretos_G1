package Figuras;

public class F8 {
public void figura8(int c) {
        System.out.print("Escalones hacia la izquierda: ");
        for (int i = 1; i <= c; i++) {// Imprimir escalones desde el lado derecho
            for (int j = c; j > i; j--) {        // Espacios para alinear el escalón en diagonal desde la derecha
                System.out.print("     ");
            }
            System.out.println("___"); // Imprimir la línea horizontal del escalón
            for (int j = c; j > i; j--) {// Espacios para alinear el soporte vertical desde la derecha
                System.out.print("     ");
            }
            System.out.println("|    ");            // Imprimir el soporte vertical del escalón
        }
    }
}
