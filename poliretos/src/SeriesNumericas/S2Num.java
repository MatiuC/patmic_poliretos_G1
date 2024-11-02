package SeriesNumericas;

import java.util.Scanner;

public class S2Num {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad para la secuencia ");
        int c = scanner.nextInt(); //c:cantidad

        System.out.println("Secuencia: ");
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) { // posición par
                System.out.print("0 ");
            } else { // posición impar
                int t = 0; 
                t = 1 + (i - 1); // Calcula el número impar correspondiente
                System.out.print(t+ " ");
            }
        }
        scanner.close();
    }
}
