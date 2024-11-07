package extras;

import java.util.Scanner;


public class validadores {
    
    public boolean esNatural(int numero) {
        return numero >= 0;
    }

    public int solicitarNumeroNatural(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
            if (!esNatural(numero)) {
                System.out.println("El número ingresado no es un número natural. Intente nuevamente.");
            }
        } while (!esNatural(numero));
        return numero;
    }

}
