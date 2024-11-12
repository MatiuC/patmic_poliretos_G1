package SeriesCaracteres;

public class S2Char {
    public void S2Char_G1(int n){
        System.out.println("Secuencia de caracteres: S2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("+");
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
