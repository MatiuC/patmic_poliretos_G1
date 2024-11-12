package CadenaCaracteres;
import java.util.Scanner;

public class C08 {
    
    public void C08_G1() {
        String[][] anagramas = {
            {"delira", "lidera"},
            {"Ballena", "llenaba"},
            {"Alondra", "Ladrona"},
            {"Enrique", "quieren"}
        };
        @SuppressWarnings("resource")
        Scanner sk = new Scanner(System.in);
        //sk.nextLine();
        for (String[] pair : anagramas) {
            String palabra = pair[0];
            String anagrama = pair[1];
            System.out.println("Ingrese el anagrama de la palabra: " + palabra);

            boolean correct = false;
            for (int i = 0; i < 3; i++) {
                if (sk.hasNextLine()) {
                    String input = sk.nextLine();
                    if (input.equalsIgnoreCase(anagrama)) {
                        System.out.println("Correcto!");
                        correct = true;
                        break;
                    } else {
                        System.out.println("Incorrecto. Te quedan " + (2 - i) + " intentos.");
                    }
                } else {
                    System.out.println("No se encontró una línea de entrada.");
                    break;
                }
            }

            if (!correct) {
                System.out.println("La respuesta correcta era: " + anagrama);
            }
        }
        
        }
    }
    