package SeriesCaracteres;

import java.util.Scanner;

public class S4Char {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de operadores a imprimir
        System.out.print("Ingrese la cantidad de operadores a imprimir: ");
        int cantidad = scanner.nextInt();

        // Array de operadores
        String[] operadores = {"+", "-", "*", "/"};

        // Imprimir la secuencia de operadores
        System.out.println("Secuencia de operadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(operadores[i % 4] + " "); // Imprime el operador correspondiente
        }
        
        scanner.close();
    }
}
