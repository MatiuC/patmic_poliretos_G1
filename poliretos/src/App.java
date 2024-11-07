import Arrays.*;
import SeriesCaracteres.*;
import SeriesNumericas.*;
import CadenaCaracteres.*;
import Figuras.*;
import Arrays.*;
import Loading.*;
import CadenaCaracteres.*;
import Figuras.*;
import GrafosAutomatas.*;
import Loading.*;
import SeriesCaracteres.*;
import SeriesNumericas.*;
import extras.*;



public class App {
    public static void main(String[] args) throws Exception {
        
        
        ScannerUtil cs = new ScannerUtil();
        

        //Cadena de caracteres
        

        C04 C4 = new C04();
        C4.cFrase04();
        cs.closeScanner(null); // Close the scanner after use
        C08 C8 = new C08();
        C8.C08();
        cs.closeScanner(null); // Close the scanner after use
        int n=10;
        // Series numéricas
        S1Char SC1 = new S1Char();
        SC1.S1Char(n);
        System.out.println("");
        S2Char SC2 = new S2Char();
        SC2.S2Char(n);
        System.out.println("");
        S3Char SC3 = new S3Char();
        SC3.S3Char(5);
        System.out.println("");
        //Draw cuadrado
        F1 F1 = new F1();
        F1.dibujarcuadrado(5);
        System.out.println("");
        F5 F5 = new F5();
        System.out.println("");
        F5.DrawF5(9);
        F6 F6 = new F6();
        F6.DrawF6(9);
        System.out.println("");
        F14 F14 = new F14();
        F14.DrawF14(5);
        System.out.println("");
        F18 F18 = new F18();
        F18.DrawF18(6);
        System.out.println("");
        S1Num S1 = new S1Num();
        S2Num S2 = new S2Num();
        S3Num S3 = new S3Num();
        S10Num S10 = new S10Num();
        S12Num S12 = new S12Num();
        // Series caracteres
  }