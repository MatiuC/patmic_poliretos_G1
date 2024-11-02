package SeriesNumericas;

public class S12Num {
    //Suma la serie en saltos de 2
    public void SerieNum12(int n){
        int acum = 2, s = 0;
        for (int i = 0; i < n; i++) {
            s = acum + s;
            System.out.print(s + " ");
            acum = acum + 2;
        }
    }
}
