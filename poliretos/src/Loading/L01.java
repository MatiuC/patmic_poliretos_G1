package Loading;

public class L01 {
    public void loading1() {
        final char[] indicadores = {'\\', '|', '/', '-'}; //indicadores de cargar
        
        final int duracionTotal = 5000; // 5 segundos // Duración total del indicador de carga (en milisegundos)
        final int pasos = 100; // De 0 a 100%
        final int tiempoEntrePasos = duracionTotal / pasos;

        for (int i = 0; i <= pasos; i++) { // Bucle para simular el indicador de carga
            int indice = i % indicadores.length;
            System.out.print("\rCargando: " + indicadores[indice] + " " + i + "%");

            try {
                Thread.sleep(tiempoEntrePasos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.print("\rCargado: 100% \n");
    }
}
