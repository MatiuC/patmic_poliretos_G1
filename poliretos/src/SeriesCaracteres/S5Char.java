package SeriesCaracteres;

import java.util.Scanner;

public class S5Char {
    public void caracter5() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de operadores a imprimir:\n ");
        int c = scanner.nextInt();
        System.out.println("Secuencia de caracteres:");
        for (int i = 0; i < c; i++) {
            String caracter; 
            switch (i % 5) {
                case 0:
                    caracter = "\\"; break;
                case 1:
                    caracter = "|"; break;
                case 2:
                    caracter = "/"; break;
                case 3:
                    caracter = "-"; break;
                case 4:
                    caracter = "|"; break;
                default:
                    caracter = ""; 
            }
            System.out.print(caracter + " "); 
        }
    }
}

