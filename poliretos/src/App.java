import SeriesNumericas.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        S10Num S10= new S10Num();
        S12Num S12 = new S12Num();
        S12.SerieNum12(10);
        System.out.println("");
        S10.SerieNum10(10);
        
    }
}