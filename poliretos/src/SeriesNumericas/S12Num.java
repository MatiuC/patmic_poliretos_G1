package SeriesNumericas;

public class S12Num {
    // Suma la serie en saltos de 2
    public void SerieNum12(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += 2 * (i + 1);
            System.out.print(s + " ");
        }
    }
}
