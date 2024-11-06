import SeriesCaracteres.*;
import SeriesNumericas.*;
import Figuras.*;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // S10Num S10= new S10Num();
        // S12Num S12 = new S12Num();
        // S12.SerieNum12(10);
        // System.out.println("");
        // S10.SerieNum10(10);
        
        // S7Num S7 = new S7Num();
        // S7.g1_mostrarSecuencia(20);
        // S8Num S8 = new S8Num();
        // S8.g1_mostrarSecuencia(20);
        // S9Num S9 = new S9Num();
        // S9.g1_mostrarSecuencia(20);

        S7Char S7 = new S7Char();
        S7.g1_mostrarSecuenciaChar(6);
        
        S8Char S8 = new S8Char();
        S8.g1_mostrarSecuenciaChar(6);

        S9Char S9 = new S9Char();
        S9.g1_mostrarSecuenciaChar(10);

        F12 F12 = new F12();
        F12.g1_mostrarFigura(10);

        F13 F13 = new F13();
        F13.g1_mostrarFigura(10);

        F17 F17 = new F17();
        F17.g1_mostrarFigura(10);
    }
}