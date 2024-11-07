package Figuras;

public class F12 {
    public void g1_mostrarFigura(int n) {
        StringBuilder maxNumber = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            maxNumber.append(i);
        }
        
        for(int i = maxNumber.length(); i >= 1; i--) {
            System.out.println(maxNumber.substring(0, i));
        }
    }
}
