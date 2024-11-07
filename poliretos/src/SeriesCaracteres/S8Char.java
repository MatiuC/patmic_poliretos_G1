package SeriesCaracteres;

public class S8Char {
    public void g1_mostrarSecuenciaChar(int n) {
        char caracter = 'a';
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < (i*2 - 1); j++) {
                System.out.print(caracter);
            }
            if(i < n) {
                System.out.print(" ");
            }
            caracter++;
        }
        System.out.println();
    }
}
