package extras;

import Arrays.*;
import CadenaCaracteres.*;
import Figuras.*;
import GrafosAutomatas.*;
import Loading.*;
import Recusion.*;
import SeriesCaracteres.*;
import SeriesNumericas.*;
import java.util.Scanner;


public class menu {
    public void mostrar_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("GRUPO 1\nAvila Dhalin\nAyala Bryan\nCasa Pizarro\nCastro Eduardo\n");
        System.out.print("Figuras:\nSeleecione el tamaño de sus series\n");
        validadores validador = new validadores();
        int secuencianum = validador.solicitarNumeroNatural("Ingrese un número mayor a 0:\n");

               System.out.println("Series Numericas");
                //Metodo de la serie numerica 1
                S1Num s1num = new S1Num();
                s1num.SerieNum1(secuencianum);
                //Metodo de la serie numerica 2
                S2Num s2num = new S2Num();
                s2num.SerieNum2(secuencianum);
                //Secuencia S4     
                g1_crearSerieNume compiladorS4 = new g1_crearSerieNume();
                compiladorS4.serieNumericaS4(secuencianum);
                //Secuencia S5
                g1_crearSerieNume compiladorS5 = new g1_crearSerieNume();
                compiladorS5.serieNumericaS5(secuencianum);
                //Secuencia S6
                g1_crearSerieNume compiladorS6 = new g1_crearSerieNume();
                compiladorS6.serieNumericaS6(secuencianum);
                System.out.println();
                //Secuencia S7
                S7Num s7num = new S7Num();
                s7num.g1_mostrarSecuencia(secuencianum); 
                //Secuencia S8
                S8Num s8num = new S8Num();
                s8num.g1_mostrarSecuencia(secuencianum);   
                //Secuencia S9
                S9Num s9num = new S9Num();
                s9num.g1_mostrarSecuencia(secuencianum); 
                //Secuencia S10
                S10Num s10num = new S10Num();
                s10num.SerieNum10(secuencianum);     
                //Metodo de la serie numerica 12
                S12Num s12num = new S12Num();
                s12num.SerieNum12(secuencianum);



                System.out.println("\nSERIES DE CARACTERES");
                System.out.print("¿Cuántas letras quieres imprimir en las secuencias de caracteres? ");
                int secuenciachar = validador.solicitarNumeroNatural("Ingrese un número mayor a 0:\n");
                // Series de caracteres
                //Serie 1
                S1Char s1 = new S1Char();
                s1.S1Char_G1(secuenciachar);
                //Serie 2
                S2Char s2 = new S2Char();
                s2.S2Char_G1(secuenciachar);
                //Serie 3
                S3Char s3 = new S3Char();
                s3.S3Char_G1(secuenciachar);
                //Serie 4
                S4Char s4 = new S4Char();
                s4.caracter4(secuenciachar);
                //Serie 5
                S5Char s5 = new S5Char();
                s5.caracter5(secuenciachar);
                //Serie 6
                //Secuencia: a b c d e f ....
                g1_crearSerieCaracter compiladorS621 = new g1_crearSerieCaracter();
                compiladorS621.serieCaracterS62(secuenciachar);
                //Secuencia a + c - e....
                g1_crearSerieCaracter compiladorS62 = new g1_crearSerieCaracter();
                compiladorS62.serieCaracterS61(secuenciachar);
                //Serie 7
                S7Char s7 = new S7Char();
                s7.g1_mostrarSecuenciaChar(secuenciachar);
                //Serie 8
                S8Char s8 = new S8Char();
                s8.g1_mostrarSecuenciaChar(secuenciachar);
                //Serie 9
                S9Char s9 = new S9Char();
                s9.g1_mostrarSecuenciaChar(secuenciachar);

                
                System.out.println("FIGURAS");
                System.out.println("Ingrese el tamaño de las figuras: ");
                int NIVELF = validador.solicitarNumeroNatural("Ingrese un número mayor a 0:\n");
                // Serie de Figuras
                //Figura 1
                F1 figura1 = new F1();
                figura1.dibujarcuadrado(NIVELF);
                //Figura 2
                g1_crearFigura figura2 = new g1_crearFigura();
                figura2.figuraF2(NIVELF);
                //Figura 3
                F3 figura3 = new F3();
                figura3.g1_mostrarFigura(NIVELF);
                //Figura 4
                F4 figura4 = new F4();
                figura4.figura4(NIVELF);
                //Figura 5
                F5 figura5 = new F5();
                figura5.DrawF5(NIVELF);
                //Figura 6
                F6 figura6 = new F6();
                figura6.DrawF6(NIVELF);
                //Figura 7
                F7 figura7 = new F7();
                figura7.figura7(NIVELF);
                //Figura 8
                F8 figura8 = new F8();
                figura8.figura8(NIVELF);
                //Figura 9
                F9 figura9 = new F9();
                figura9.figura9(NIVELF);
                //Figura10
                g1_crearFigura figura10 = new g1_crearFigura();
                figura10.figuraF10(NIVELF);
                //Figura11
                g1_crearFigura figura11 = new g1_crearFigura();    
                figura11.figuraF11(NIVELF);
                //Figura12
                F12 figura12 = new F12();
                figura12.g1_mostrarFigura(NIVELF);
                //Figura13
                F13 figura13 = new F13();
                figura13.g1_mostrarFigura(NIVELF);
                //Figura14
                F14 figura14 = new F14();
                figura14.DrawF14(NIVELF);
                //Figura15
                F15 figura15 = new F15();
                figura15.figura15(NIVELF);
                //Figura F16
                g1_crearFigura figura16 = new g1_crearFigura();
                figura16.figuraF16(NIVELF);
                //Figura F17
                F17 figura17 = new F17();
                figura17.g1_mostrarFigura(NIVELF);
                //Figura F18
                F18 figura18 = new F18();
                figura18.DrawF18(NIVELF);
                //Figura F19
                F19 figura19 = new F19();
                figura19.figura19(NIVELF);


                System.out.println("Opción 4 seleccionada");
                System.out.println("Cadenas de caracteres");
                //Cadena de caracteres
                //Cadena 01
                C01 cadena01 = new C01();
                System.out.print("Ingrese una frase para contar sus vocales: ");
                cadena01.cadena1(scanner.nextLine());
                //Cadena 02
                g1_crearCadenaCaracter cadenaCaracter = new g1_crearCadenaCaracter();
                System.out.print("Ingrese una frase para contar sus letras consonantes: ");
                cadenaCaracter.cadenaCaracter02(new String[]{scanner.nextLine()});
                //Cadena 03 
                C03 cadena03 = new C03();
                cadena03.g1_eliminarVocal();
                //Cadena 04
                C04 cadena04 = new C04();
                System.out.print("Ingrese una palabra: ");
                String palabra = scanner.nextLine();
                System.out.print("Ingrese una letra: ");
                char letra = scanner.next().charAt(0);
                cadena04.cFrase04(palabra, letra);
                //cadena 05
                C05 cadena05 = new C05();
                System.out.print("Ingrese una frase para invertir: ");
                cadena05.cadena5(scanner.nextLine());
                //Cadena 06
                g1_crearCadenaCaracter compiladorCadena = new g1_crearCadenaCaracter();
                System.out.print("Ingresa una frase para invertir: ");
                String frase = scanner.next();
                compiladorCadena.invertirFrase(new String[]{frase});
                //Cadena 07
                C07 cadena07 = new C07();
                System.out.print("Ingrese una frase para presentarla sin la J: ");
                cadena07.g1_convertirSinJ();
                //Cadena 08
                /*C08 cadena08 = new C08();
                System.out.print("Anagrama de palabras: ");
                cadena08.C08_G1();*/
                //Cadena 09
                C09 cadena09 = new C09();
                System.out.print("Ingrese una frase para convertir mayusculas a minusculas y viseversa: ");
                cadena09.cadena9(scanner.nextLine());
                
                //scanner.nextLine();
                System.out.println("Opción 5 seleccionada");
                System.out.println("Arrays");
                 //Arrays
                g1_crearArray arraySerie = new g1_crearArray();
                // Ejercicio 1: Barras de carga para cada palabra del nombre, validar los datos que entran. Revisar la salida
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

                //Array 04
                System.out.println("Ejercicio 04");
                A04 array04 = new A04();
                array04.executeA04("eduardo", "castro");
           

                

        
                System.out.println("Opción 6 seleccionada");
                System.out.println("Loading");

                L12 loading12 = new L12();
                try {
                    loading12.loading12();
                } catch (InterruptedException e) {
                    System.out.println("La animación fue interrumpida.");
                }

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
               
                System.out.println("Opción no válida");

                //Autómata A06
                Automata06 automata06 = new Automata06();
                automata06.validarEntrada();
                //Autómata A07
                Automata07 automata07 = new Automata07();
                automata07.validarEntrada();
        }
        
    }
    

