package Figuras;

public class g1_crearFigura {
    // Método para generar la figura F2  
    public void figuraF2(int niveles) {
        System.out.println("Dibujando figura F2 con " + niveles + " niveles");
        int filas = 2 * niveles + 1;
        int columnas = 2 * niveles + 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((i == 0 || i == filas - 1) && (j == 0 || j == columnas - 1)) {
                    System.out.print("* ");
                } else if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
    
    // Método para generar la figura F10
    public void figuraF10(int niveles) {
        System.out.println("Dibujando figura F10 con " + niveles + " niveles");
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < 3 * i; j++) {
                System.out.print("  ");
            }
            System.out.print("|");
            if (i % 2 == 0) {
                System.out.print("_+_");
            } else {
                System.out.print("_-_");
            }
            System.out.println();
        }
    }

    // Método para generar la figura F11
    public void figuraF11(int niveles) {
        System.out.println("Dibujando figura F11 con " + niveles + " niveles");
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print("|");
                for (int j = 0; j < i; j++) {
                    System.out.print("_");
                }
            }
            System.out.println(); 
        }
    }

    // Método para generar la figura F16
    public void figuraF16(int niveles) {
        System.out.println("Dibujando figura F16 con " + niveles + " niveles");
        for (int i = 0; i < niveles; i++) {
            if (i == 0 || i == niveles - 1) {
                System.out.println("+       +");
            } 
            else if (i % 2 == 1) {
                System.out.println("  -   -  ");
            } 
            else {
                System.out.println("    +    ");
            }
        }
    }
}
