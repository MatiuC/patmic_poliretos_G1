package SeriesNumericas;



public class S1Num {
    public void SerieNum1 (int c) {
        int a = 0, b = 1;
        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < c; i++) {
            System.out.print(a + " ");
            int s = a + b; //s: valor siguiente
            a = b;
            b = s;
        }
        System.out.println();
    }
}
