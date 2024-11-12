package SeriesCaracteres;

import java.util.Scanner;

public class S4Char {
    public void caracter4() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese la cantidad de operadores a imprimir: ");
        int cantidad = scanner.nextInt();
        String[] operadores = {"+", "-", "*", "/"};
        System.out.println("Secuencia de operadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(operadores[i % 4] + " "); 
        }
    }
}
