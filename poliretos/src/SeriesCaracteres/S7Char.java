package SeriesCaracteres;

public class S7Char {
    public void g1_mostrarSecuenciaChar(int n) {
        System.out.println("Secuencia de caracteres: S7");
        char caracter = 'a';
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < (i+1) * 2; j++) {
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
