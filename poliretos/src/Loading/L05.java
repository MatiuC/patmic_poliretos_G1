package Loading;

public class L05 {
    public void loading5() {
        int totalCaracteres = 20; // total de caracteres en la barra
        int progreso = 0;          // inicializa el progreso
        int paso = 100 / totalCaracteres; // calcula el porcentaje de progreso por carácter
        while (progreso <= 100) {
            int caracteresLlenos = progreso / paso;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < totalCaracteres; i++) {
                if (i < caracteresLlenos) {
                    barra.append("=");
                } else {
                    barra.append(" ");
                }
            }
            if (progreso < 100) {
                barra.append(">");
            } else {
                barra.append("-");
            }
            barra.append("] "); // Cierra la barra
            barra.append(progreso).append("%"); // Muestra el porcentaje
            // Imprime la barra de progreso
            System.out.print("\r" + barra.toString()); // Usar \r para sobrescribir la línea
            try {
                Thread.sleep(200); // Espera 200 ms entre cada actualización
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            progreso += paso;
        }
        System.out.println();
    }
}

