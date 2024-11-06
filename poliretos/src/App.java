import Arrays.A03;
import CadenaCaracteres.*;
import Figuras.*;
import GrafosAutomatas.*;
import Loading.*;
import SeriesCaracteres.*;
import SeriesNumericas.*;

public class App {
    public static void main(String[] args) throws Exception {
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
        S1Num S1 = new S1Num();
        S2Num S2 = new S2Num();
        S3Num S3 = new S3Num();
        S10Num S10 = new S10Num();
        S12Num S12 = new S12Num();
        // Series caracteres
        
        S4Char SC4 = new S4Char();
        S5Char SC5 = new S5Char();
        // Figuras
        F4 Fg4 = new F4();
        F7 Fg7 = new F7();
        F8 Fg8 = new F8();
        F9 Fg9 = new F9();
        F15 Fg15 = new F15();
        F19 Fg19 = new F19();
        // Cadena caracteres
        C01 CO1 = new C01();
        C05 CO5 = new C05();
        C09 CO9 = new C09();
        // Arrays
        A03 A3 = new A03();
        // Loading exercise
        L01 Load1 = new L01();
        L05 Load5 = new L05();
        L09 Load9 = new L09();
        L12 Load12 = new L12();
        // Automatas
        Automata01 Aut1 = new Automata01();
        Automata02 Aut2 = new Automata02();

        S1.SerieNum1();
        System.out.println("");
        S2.SerieNum2();
        System.out.println("");
        S3.SerieNum3();
        System.out.println("");
        S12.SerieNum12(10);
        System.out.println("");
        S10.SerieNum10(10);


        
        SC4.caracter4();
        System.out.println("");
        SC5.caracter5();
        System.out.println("");

        Fg4.figura4();
        System.out.println("");
        Fg7.figura7();
        System.out.println("");
        Fg8.figura8();
        System.out.println("");
        Fg9.figura9();
        System.out.println("");
        Fg15.figura15();
        System.out.println("");
        Fg19.figura19();
        System.out.println("");

        CO1.cadena1();
        System.out.println("");
        CO5.cadena5();
        System.out.println("");
        CO9.cadena9();
        System.out.println("");

        A3.array03();
        System.out.println("");

        Load1.loading1();
        System.out.println("");
        Load5.loading5();
        System.out.println("");
        Load9.loading9();
        System.out.println("");
        Load12.loading12();
        System.out.println("");

        Aut1.autom1();
        System.out.println("");
        Aut2.autom2();
        System.out.println("");
    }
}
