package extras;

import java.util.Scanner;


public class validadores {
    
    public boolean esNatural(int numero) {
        return numero > 0;
    }

    public int solicitarNumeroNatural(String mensaje) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
            if (!esNatural(numero)) {
                System.out.println("El número ingresado no es un número mayor a 0. Intente nuevamente.\n");
            }
        } while (!esNatural(numero));
        return numero;
    }

}
