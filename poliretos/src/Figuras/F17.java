package Figuras;

public class F17 {
    public void g1_mostrarFigura(int n) {
        // Para cada fila
        for(int i = 0; i < n; i++) {
            // Para cada columna
            for(int j = 0; j < n; j++) {
                // Diagonal principal (↘) y diagonal secundaria (↙)
                if(i == j || i + j == n-1) {
                    // Si j es par en las posiciones donde imprimimos, ponemos 1
                    // Si j es impar en las posiciones donde imprimimos, ponemos 0
                    if(j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print("  "); // Dos espacios para mantener el alineamiento
                }
            }
            System.out.println(); // Nueva línea
        }
    }
}
