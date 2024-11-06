package SeriesCaracteres;

public class g1_crearSerieCaracter {
    
    public void serieCaracterS61(int tamano) {
        
        for (int i = 0; i < tamano; i++) {
            if (i % 2 == 0) { 
                char letra = (char) ('a' + (i / 2)); 
                System.out.print(letra);
            } else { 
                if (i % 4 == 1) {
                    System.out.print(" + "); 
                } else {
                    System.out.print(" - "); 
                }
            }
        }
        System.out.println();
    }

    public void serieCaracterS62(int tamano) {
        for (char letra = 'a'; letra < 'a' + tamano; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }
}

