package Figuras;

public class F3 {
    public void g1_mostrarFigura(int n) {
        System.out.println("Figura 3:");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}

