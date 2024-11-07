package CadenaCaracteres;

import java.util.Scanner;

public class C08 {
    public void C08() {
        String[][] anagramas = {
            {"delira", "lidera"},
            {"Ballena", "llenaba"},
            {"Alondra", "Ladrona"},
            {"Enrique", "quieren"}
        };

        Scanner scanner = new Scanner(System.in);
        for (String[] pair : anagramas) {
            String palabra = pair[0];
            String anagrama = pair[1];
            System.out.println("Ingrese el anagrama de la palabra: " + palabra);

            boolean correct = false;
            for (int i = 0; i < 3; i++) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase(anagrama)) {
                    System.out.println("Correcto!");
                    correct = true;
                    break;
                } else {
                    System.out.println("Incorrecto. Te quedan " + (2 - i) + " intentos.");
                }
            }

            if (!correct) {
                System.out.println("La respuesta correcta era: " + anagrama);
            }
        }
        scanner.close();
    }
    
}