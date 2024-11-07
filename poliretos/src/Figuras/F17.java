package Figuras;

public class F17 {
    public void g1_mostrarFigura(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == n-1) {
                    if(j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}
