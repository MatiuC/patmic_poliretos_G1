package SeriesNumericas;

import java.util.Scanner;
public class S1Num {
    public void SerieNum1 () {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la secuencia de Fibonacci: ");
        int c = scanner.nextInt(); //c : cantidad
        int a = 0, b = 1;
        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < c; i++) {
            System.out.print(a + " ");
            int s = a + b; //s: valor siguiente
            a = b;
            b = s;
        }
    }
}

