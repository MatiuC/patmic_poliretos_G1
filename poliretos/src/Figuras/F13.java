package Figuras;

public class F13 {
    public void g1_mostrarFigura(int n) {
        for(int i = 1; i <= n; i++) {
            StringBuilder number = new StringBuilder();
            for(int j = 1; j <= i; j++) {
                number.append(j);
            }
            System.out.println(number);
        }
    }
}
