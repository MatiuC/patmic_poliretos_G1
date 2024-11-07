package Arrays;

import java.util.Scanner;

public class A04 {
    public void executeA04(){
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese su nombre y apellido: ");
        String input = scanner.nextLine();
        
        int length = input.length();
        char[][] matrix = new char[length][length];
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    matrix[i][j] = input.charAt(i);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
