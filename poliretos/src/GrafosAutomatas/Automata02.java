package GrafosAutomatas;

import java.util.Scanner;

public class Automata02 {
public void autom2() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una cadena para validar (ab+ca): ");
    String input = scanner.nextLine();
    if (validarCadena(input)) {
        System.out.println("La cadena es válida.");
    } else {
        System.out.println("La cadena no es válida.");
    }
}
public static boolean validarCadena(String cadena) {
    int[][] matrizTransicion = {
        //   'a'   'b'   'c'
        {  1,    -1,    -1 },  // q0
        {  -1,   2,    -1  },  // q1
        {  -1,   2,     3  }, // q2
        {   4,   -1,   -1 },  //q3
        {  -1,   -1,   -1 }  // q4
    };
    int estado = 0;  // Estado inicial
    boolean cLeido = false;  // Para asegurarnos de que solo se lea un 'c'

    // Recorremos la cadena de entrada
    for (char c : cadena.toCharArray()) {
        int columna;
        if (c == 'a') { columna = 0;
        } else if (c == 'b') { columna = 1;
        } else if (c == 'c') { columna = 2;
            if (cLeido) {
                return false;
            }
            cLeido = true;
        } else {
            return false;  // Si el carácter no es 'a', 'b', o 'c', la cadena es inválida
        }
        estado = matrizTransicion[estado][columna];
        if (estado == -1) {
            return false;
        }
    }
    return estado == 4;//estado 4 final 
}
}
