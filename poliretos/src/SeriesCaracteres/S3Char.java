package SeriesCaracteres;

public class S3Char {
    public void S3Char_G1(int n){
        System.out.println("Secuencia de caracteres: S3");
        int s = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            s += i;
        }
        System.out.println("");
    }
}
