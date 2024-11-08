package Figuras;

public class F18 {
    public void DrawF18(int filas) {
        ///Realizar con matrices
        for (int f = 1; f <= filas; f++) {
            for (int c = 1; c <= f; c++) {
                if (c == 1 && f != 1) {
                    System.out.print(1 + " ");
                } else if (c == f) {
                    System.out.print(2 + " ");
                } else {
                    int numero = 1;
                    for (int k = 1; k < c; k++) {
                        numero += f - k;
                    }
                    System.out.print(numero + " ");
                }
            }
            System.out.println("");
        }
    }
}