package extras;

import SeriesNumericas.*;
import java.util.Scanner;

import Arrays.g1_crearArray;
import CadenaCaracteres.g1_crearCadenaCaracter;
import Figuras.g1_crearFigura;
import GrafosAutomatas.g1_crearGrafoAutomata;
import Loading.g1_crearLoading;
import Recusion.g1_crearRecursion;
import SeriesCaracteres.g1_crearSerieCaracter;


public class menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 8:\n1. Series Numericas\n2. Series de caracteres\n3. Figuras\n4. Cadena de caracteres");
        System.out.print("\n5. Arreglos\n6. Loading\n7. Recursion\n8. Grafos y Automatas\n");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Series Numericas");
                //Metodo de la serie numerica 1
                S1Num s1num = new S1Num();
                s1num.SerieNum1();
                //Metodo de la serie numerica 2
                S2Num s2num = new S2Num();
                s2num.SerieNum2();
                //Secuencia S4     
                System.out.print("Ingrese un numero para la secuencia S4? ");
                int tamanoS4 = scanner.nextInt();
                g1_crearSerieNume compiladorS4 = new g1_crearSerieNume();
                compiladorS4.serieNumericaS4(tamanoS4);
                System.out.println();
                 //Secuencia S5
                  System.out.print("¿Ingrese un numero para la secuencia S5? ");
                int cantidadPrimos = scanner.nextInt();
                g1_crearSerieNume compiladorS5 = new g1_crearSerieNume();
                compiladorS5.serieNumericaS5(cantidadPrimos);
                System.out.println();
                //Secuencia S6
                System.out.print("¿Cuántos números quieres mostrar en la secuencia S6? ");
                int tamanoS6 = scanner.nextInt();
                g1_crearSerieNume compiladorS6 = new g1_crearSerieNume();
                compiladorS6.serieNumericaS6(tamanoS6);
                System.out.println();
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                System.out.println("Series de caracteres");
                // Series de caracteres
                //Secuencia: a b c d e f ....
                g1_crearSerieCaracter compiladorS621 = new g1_crearSerieCaracter();
                System.out.print("¿Cuántas letras quieres imprimir en la secuencia S61? ");
                int cantidadS62 = scanner.nextInt();
                compiladorS621.serieCaracterS62(cantidadS62);
                System.out.println();
                //Secuencia a + c - e....
                g1_crearSerieCaracter compiladorS62 = new g1_crearSerieCaracter();
                System.out.print("¿Cuántas letras quieres imprimir en la secuencia S62? ");
                int cantidadS61 = scanner.nextInt();
                compiladorS62.serieCaracterS61(cantidadS61);
                System.out.println();
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                System.out.println("Figuras");
                // Serie de Figuras
                //Figura 2
                g1_crearFigura figura2 = new g1_crearFigura();
                System.out.print("¿Cuántos niveles deseas para la figura F16? ");
                int nivelesF2 = scanner.nextInt();
                figura2.figuraF2(nivelesF2);
                System.out.println();
                //Figura10
                g1_crearFigura figura10 = new g1_crearFigura();
                System.out.print("¿Cuántos niveles deseas para la figura F10? ");
                int nivelesF10 = scanner.nextInt();
                figura10.figuraF10(nivelesF10);
                System.out.println();
                //Figura11
                g1_crearFigura figura11 = new g1_crearFigura();    
                System.out.print("¿Cuántos niveles deseas para la figura F11? ");
                int nivelesF11 = scanner.nextInt();
                figura11.figuraF11(nivelesF11);
                System.out.println();
                //Figura F16
                g1_crearFigura figura16 = new g1_crearFigura();
                System.out.print("¿Cuántos niveles deseas para la figura F16? ");
                int nivelesF16 = scanner.nextInt();
                figura16.figuraF16(nivelesF16);
                System.out.println();

                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                System.out.println("Cadenas de caracteres");
                // Cadena de caracteres
                scanner.nextLine(); 
                g1_crearCadenaCaracter cadenaCaracter = new g1_crearCadenaCaracter();
                System.out.print("Ingrese una frase para contar sus letras: ");
                cadenaCaracter.cadenaCaracter02(new String[]{scanner.nextLine()});
                System.out.println();
                g1_crearCadenaCaracter compiladorCadena = new g1_crearCadenaCaracter();
                System.out.print("Ingresa una frase para invertir: ");
                String frase = scanner.next();
                compiladorCadena.invertirFrase(new String[]{frase});
                System.out.println();
                break;
            case 5:
                System.out.println("Opción 5 seleccionada");
                System.out.println("Arrays");
                 //Arrays
                g1_crearArray arraySerie = new g1_crearArray();
                // Ejercicio 1: Barras de carga para cada palabra del nombre
                System.out.print("Ingrese su nombre completo: ");
                String nombreCompleto = scanner.nextLine();
                String[] palabras = nombreCompleto.split(" ");
                int[] porcentajes = new int[palabras.length];
                System.out.print("Ingrese el porcentaje de carga para cada palabra: ");
                for (int i = 0; i < palabras.length; i++) {
                    porcentajes[i] = scanner.nextInt();
                }
                scanner.nextLine(); 
                arraySerie.mostrarCargaNombre(palabras, porcentajes);
                System.out.println();

                // Ejercicio 2: Llenar matriz con letras del nombre
                System.out.print("Ingrese su nombre completo para la matriz: ");
                nombreCompleto = scanner.nextLine();
                arraySerie.llenarMatrizConNombre(nombreCompleto);
                break;
            case 6:
                System.out.println("Opción 6 seleccionada");
                System.out.println("Loading");
                g1_crearLoading loading = new g1_crearLoading();

                try {
                   // Ejercicio L03: Desplazamiento de carácter
                   System.out.print("Ingrese un caracter para el desplazamiento: ");
                   char caracter = scanner.next().charAt(0);
                   System.out.print("Ingrese la duración de la animación en milisegundos (ej: 200): ");
                   int duracionL03 = scanner.nextInt();
                   loading.animarL03(caracter, duracionL03);

                   // Ejercicio L07: Barra con movimiento rotacional
                   System.out.print("Ingrese la duración de la animación para L07 en milisegundos (ej: 200): ");
                   int duracionL07 = scanner.nextInt();
                   loading.animarL07(duracionL07);

                   // Ejercicio L11: Señal simétrica
                   System.out.print("Ingrese el número de niveles para la señal: ");
                   int niveles = scanner.nextInt();
                   System.out.print("Ingrese la duración de la animación para L11 en milisegundos (ej: 200): ");
                   int duracionL11 = scanner.nextInt();
                   loading.animarL11(duracionL11, niveles);

                }catch (InterruptedException e) {
                   System.out.println("La animación fue interrumpida.");
                }finally {
                   scanner.close();
                }
                break;
            case 7:
                System.out.println("Opción 7 seleccionada");
                System.out.println("Recursion");
                // Recursion
        
                g1_crearRecursion recursion = new g1_crearRecursion();

                // Ejercicio R04: Potencia
                System.out.print("Ingrese la base para la potencia: ");
                int base = scanner.nextInt();
                System.out.print("Ingrese el exponente para la potencia: ");
                int exponente = scanner.nextInt();
                int resultadoPotencia = recursion.potencia(base, exponente);
                System.out.println("Resultado de " + base + " elavado a " + exponente + " = " + resultadoPotencia);

                // Ejercicio R05: Conteo Progresivo
                System.out.print("Ingrese un numero para contar progesivamente: ");
                int numeroProgresivo = scanner.nextInt();
                System.out.println("Conteo progresivo hasta " + numeroProgresivo + ":");
                recursion.conteoProgresivoHasta(numeroProgresivo);
                System.out.println();

                // Ejercicio R06: Conteo Regresivo
                System.out.print("Ingrese un numero para contar regresivamente: ");
                int numeroRegresivo = scanner.nextInt();
                System.out.println("Conteo regresivo desde " + numeroRegresivo + ":");
                recursion.conteoRegresivo(numeroRegresivo);
                break;
            case 8:
                System.out.println("Opción 8 seleccionada");
                System.out.println("Grafos y automatas");
                //Serie Grafos y automatas
                g1_crearGrafoAutomata grafoAutomata = new g1_crearGrafoAutomata();
                // A04: Validación de número decimal
                System.out.print("Ingrese un número para verificar si es decimal: ");
                String numeroDecimal = scanner.nextLine();
                boolean esDecimal = grafoAutomata.esNumeroDecimal(numeroDecimal);
                System.out.println(" Su numero " + (esDecimal ? "sí" : "no")+ " es un numero decimal");
                // A05: Validación de declaración de variable en Java
                System.out.print("Ingrese una declaración de variable para verificar si es válida en Java: ");
                String declaracionVariable = scanner.nextLine();
                boolean esDeclaracionValida = grafoAutomata.esDeclaracionVariableValida(declaracionVariable);
                System.out.println("Su declaracion de variable " + (esDeclaracionValida ? "si" : "no")+" es valida");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
    
}
