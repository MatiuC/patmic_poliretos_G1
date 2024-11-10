package GrafosAutomatas;

import java.util.Scanner;

public class Automata01 {
    public void autom1() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena para validar (a*b+c): ");
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
            {  0,    1,    -1 },  // q0
            {  -1,   1,    2  },  // q1
            {  -1,   -1,   -1 }   // q2
        };
        int estado = 0; 
        boolean cLeido = false;// Variable para asegurar que solo hay un 'c'
        for (char c : cadena.toCharArray()) {        // Recorremos la cadena de entrada
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
            if (estado == -1) { //no es posible la transición 
                return false;
            }
        }
        return estado == 2; //estado 2 final 
    }
}

