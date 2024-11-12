package SeriesNumericas;

public class g1_crearSerieNume {

    public void serieNumericaS4(int tamano) {
        System.out.println("Secuencia de números primos: ");
        int numeroIzq1 = 0,numeroIzq2 = 1,numeroDer = 2,siguienteNumeroIzq;  
        for (int i = 0; i < tamano; i++) {
            System.out.print(numeroIzq1 + "/" + numeroDer + " ");
            siguienteNumeroIzq = numeroIzq1 + numeroIzq2;
            numeroIzq1 = numeroIzq2;
            numeroIzq2 = siguienteNumeroIzq;
            numeroDer += 2;
        }
        System.out.println(); 
    }

    public void serieNumericaS5(int cantidad) {
        System.out.println("Secuencia de números primos: ");
        int contador = 0, numero = 2;    
        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        System.out.println(); 
    }
    public boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void serieNumericaS6(int tamanoS6){
        System.out.println("Secuencia de números: S6");
        int i=3,j=1;
        for(int cont = 0; cont < tamanoS6; cont++){
            System.out.print(j+" ");
            j=j+i;
            i=i+2;
        }
    }

}
