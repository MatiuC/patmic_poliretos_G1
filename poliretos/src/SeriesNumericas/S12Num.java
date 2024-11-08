package SeriesNumericas;
import extras.validadores;

public class S12Num {
    // Suma la serie en saltos de 2
    public void SerieNum12(int n) {
        validadores validador = new validadores();
        if (!validador.esNatural(n)) {
            System.out.println("El número debe ser natural (mayor o igual a 0).");
            return;
        }
        
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += 2 * (i + 1);
            System.out.print(s + " ");
        }
    }
}
