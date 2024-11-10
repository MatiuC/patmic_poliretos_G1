package SeriesNumericas;

public class S2Num {
    public void SerieNum2(int c) {
        System.out.println("Secuencia de números pares e impares: ");
        int contadorImpar = 1; // comienza desde 1 para los impares
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) { // posición par
                System.out.print("0 ");
            } else { // posición impar
                System.out.print(contadorImpar + " ");
                contadorImpar += 2; // incrementa para el siguiente impar
            }
        }
        System.out.println();
    }
}
