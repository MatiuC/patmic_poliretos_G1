package SeriesNumericas;

public class S10Num {
    public void SerieNum10(int n){
        System.out.println("Secuencia de potencias de 3:");
        for (int i = 1; i < n; i++) {
            System.out.print((int)Math.pow(3, i) + ", ");
        }
        System.out.println("");
    }
}
