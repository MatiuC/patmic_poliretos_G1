package SeriesNumericas;

import extras.validadores;

public class S1Num {
    public void SerieNum1 () {
        validadores validador = new validadores();
        
        int c = validador.solicitarNumeroNatural("Ingrese la cantidad de términos de la secuencia de Fibonacci: ");
        
        int a = 0, b = 1;
        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < c; i++) {
            System.out.print(a + " ");
            int s = a + b; //s: valor siguiente
            a = b;
            b = s;
        }
    }
}
