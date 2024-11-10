package SeriesCaracteres;

public class S4Char {
    public void caracter4(int c) {
        String[] operadores = {"+", "-", "*", "/"};
        System.out.println("Secuencia de operadores:");
        for (int i = 0; i < c; i++) {
            System.out.print(operadores[i % 4] + " "); 
        }
        System.out.println();
    }
}
