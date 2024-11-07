package extras;

import SeriesNumericas.*;
import java.util.Scanner;


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

                //Metodo de la serie numerica 12
                S12Num s12num = new S12Num();
                s12num.SerieNum12(-6);
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
            case 5:
                System.out.println("Opción 5 seleccionada");
                break;
            case 6:
                System.out.println("Opción 6 seleccionada");
                break;
            case 7:
                System.out.println("Opción 7 seleccionada");
                break;
            case 8:
                System.out.println("Opción 8 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
    
}
