package CadenaCaracteres;

import java.util.Scanner;

public class C09 {
public void cadena9() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Cambia cada letra por una mayúscula o minúscula de una frase:");
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado.append(Character.toUpperCase(letra)); // Letras en mayúscula para índices pares
            } else {
                resultado.append(Character.toLowerCase(letra)); // Letras en minúscula para índices impares
            }
        }
        System.out.println("La frase final es: " + resultado);
    }
}
