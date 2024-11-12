package SeriesCaracteres;

public class S1Char {
    public void S1Char_G1(int n){
        System.out.println("Secuencia de caracteres: S1");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
        }
        System.out.println("");
    }
}
