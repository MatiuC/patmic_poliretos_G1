package Arrays;

import java.util.Random;

public class g1_crearArray {

    // Ejercicio 1: Mostrar barras de carga para cada palabra del nombre
    public void mostrarCargaNombre(String[] palabras, int[] porcentajes) {
        for (int i = 0; i < palabras.length; i++) {
            mostrarBarraCarga(porcentajes[i], palabras[i]);
        }
    }

    public void mostrarBarraCarga(int porcentaje, String palabra) {
        int cantidadCaracteres = porcentaje / 10; // Cada 10% es un caracter en la barra
        StringBuilder barra = new StringBuilder("[");

        for (int i = 0; i < 10; i++) {
            if (i < cantidadCaracteres) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }
        barra.append("] ").append(porcentaje).append("% ").append(palabra);

        System.out.println(barra.toString());
    }

    // Ejercicio 2: Llenar matriz cuadrada con letras del nombre en posiciones aleatorias
    public void llenarMatrizConNombre(String nombreCompleto) {
        int longitudNombre = nombreCompleto.length();
        int tamañoMatriz = (int) Math.ceil(Math.sqrt(longitudNombre));
        char[][] matriz = new char[tamañoMatriz][tamañoMatriz];
        Random random = new Random();

        // Inicializar matriz con espacios
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Colocar letras en posiciones aleatorias
        for (char letra : nombreCompleto.toCharArray()) {
            int fila, columna;
            do {
                fila = random.nextInt(tamañoMatriz);
                columna = random.nextInt(tamañoMatriz);
            } while (matriz[fila][columna] != ' ');

            matriz[fila][columna] = letra;
        }

        // Imprimir la matriz
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
