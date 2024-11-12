package SeriesCaracteres;

public class S9Char {
    public void g1_mostrarSecuenciaChar(int n) {
        System.out.println("Secuencia de caracteres: S9");
        char caracter = 'a';
        int prevPrev = 1; 
        int prev = 1;   
        for(int i = 1; i <= n; i++) {
            int repeticiones;
            if(i <= 3) {
                repeticiones = 1; 
            } else {
                repeticiones = prevPrev + prev;
                prevPrev = prev;
                prev = repeticiones;
            }
            for(int j = 0; j < repeticiones; j++) {
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
