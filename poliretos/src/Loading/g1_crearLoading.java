package Loading;

import java.util.Random;

public class g1_crearLoading {

    // Ejercicio L03: Caracter que se desplaza de izquierda a derecha
    public void animarL03(char caracter, int duracion) throws InterruptedException {
        int longitudBarra = 20;

        for (int i = 0; i <= longitudBarra; i++) {
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j == i) {
                    barra.append(caracter);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(i * 5).append("%");
            System.out.print("\r" + barra.toString());
            Thread.sleep(duracion);
        }
        System.out.println();
    }

    // Ejercicio L07: Barra que avanza con movimiento rotacional
    public void animarL07(int duracion) throws InterruptedException {
        int longitudBarra = 20;
        char[] rotacion = {'\\', '|', '/', '-'};
        int porcentaje = 0;

        for (int i = 0; i <= longitudBarra; i++) {
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < i; j++) {
                barra.append("=");
            }
            barra.append(rotacion[i % rotacion.length]);
            for (int j = i + 1; j < longitudBarra; j++) {
                barra.append(" ");
            }
            porcentaje = (i * 5);
            barra.append("] ").append(porcentaje).append("%");
            System.out.print("\r" + barra.toString());
            Thread.sleep(duracion);
        }
        System.out.println();
    }

    // Ejercicio L11: Generar una señal simétrica con eje central
    public void animarL11(int duracion, int niveles) throws InterruptedException {
        Random random = new Random();

        for (int nivel = 1; nivel <= niveles; nivel++) {
            int longitud = random.nextInt(10) + 1;
            StringBuilder senal = new StringBuilder();

            // Agregar espacios y rayas a la izquierda del eje central
            for (int i = 0; i < longitud; i++) {
                senal.append("-");
            }
            senal.append("|"); // Eje central
            // Agregar rayas a la derecha del eje central
            for (int i = 0; i < longitud; i++) {
                senal.append("-");
            }

            System.out.print("\r" + senal.toString() + " Nivel: " + nivel);
            Thread.sleep(duracion);
        }
        System.out.println();
    }
}

