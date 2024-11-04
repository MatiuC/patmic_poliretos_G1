package SeriesNumericas;

import java.util.Scanner;
public class S2Num {
    public void SerieNum2() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos para la secuencia: ");
        int c = scanner.nextInt(); // c: cantidad
        System.out.println("Secuencia: ");
        int contadorImpar = 1; // comienza desde 1 para los impares
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) { // posición par
                System.out.print("0 ");
            } else { // posición impar
                System.out.print(contadorImpar + " ");
                contadorImpar += 2; // incrementa para el siguiente impar
            }
        }
    }
}
