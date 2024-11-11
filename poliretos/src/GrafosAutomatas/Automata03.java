package GrafosAutomatas; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Automata03 {
    //Matriz de transicion
         //   'a'   'b'   'c'
         private final int matrizTransicion[][]  = {
            //a      b      c  ENTER
            {  1,    -1,    -1,   -1  },  // q0
            {  1,     2,    -1,   -1 },  // q1
            {  -1,    2,     3,   -1 },   // q2
            {  -1,   -1,     3,    100 }   // q3
           };

           // Devuelve el índice correspondiente a cada carácter, indice de mi alfabeto
           private int getIndexAlfabeto(char c) {
            return switch (c) {
                case 'a' -> 0;
                case 'b' -> 1;
                case 'c' -> 2;
                case '\n' -> 3; // Estado de aceptación, `ENTER`
                default -> -1; // Carácter no reconocido
            };
        }
        // Procesa una cadena y determina si es aceptada
        public boolean processString(String input) {
            int currentState = 0;
            
            for (char c : input.toCharArray()) {
                int index = getIndexAlfabeto(c);
                if (index == -1) {
                    return false; // Carácter no válido
                }
                currentState = matrizTransicion[currentState][index];
                if (currentState == -1) {
                    return false; // Transición no válida
                }
            }
            
            // Verifica si el estado final es un estado de aceptación (q3)
            return currentState == 100;
        }

        // Lee y procesa cada línea de un archivo de texto
        public void processFile(String fileName) {
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (processString(line)) {
                        System.out.println("Cadena válida");
                    } else {
                        System.out.println("Cadena no válida");
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("Archivo no encontrado: " + fileName);
            }
        }

        
    }

 

