package SeriesCaracteres;

public class S1Char {
    public void S1Char_G1(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
        }
    }
}
