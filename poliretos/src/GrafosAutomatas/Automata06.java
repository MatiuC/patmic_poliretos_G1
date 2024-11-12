package GrafosAutomatas;

import java.util.Scanner;

public class Automata06 {
    final String alfabeto = "f-o-r-i-e-l-s-a-c-h- -\t-(-)-{-\n";
    final int OK = 999;  // Estado de finalización
    final int ER = -1;   // Estado de error
 

    int[][] m = {//f       o       r       i       e       l       s       a       c       h     space   tab     (        )       {      \n
                 {1     ,-1     ,-1     ,24     ,46     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}   // q0  =
                ,{-1     ,2     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q1   =
                ,{-1     ,-1     ,3      ,-1     ,-1    ,-1      ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1    ,-1}  // q2   =
                ,{-1     ,-1     ,-1     ,-1     ,12     ,-1     ,-1     ,-1     ,-1     ,-1     ,9      ,6      ,4      ,-1     ,-1    ,-1}  // q3  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,5     ,-1     ,OK}  // q4  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1    ,OK}  // q5  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,7     ,-1      ,-1    ,-1}   // q6  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,8      ,-1    ,OK}  // q7  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q8  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,10     ,-1     ,-1     ,-1}  // q9  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,11     ,-1     ,OK}  // q10  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q11  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,13     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q12  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,14     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q13  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,15     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q14  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,21     ,16     ,19     ,-1     ,-1     ,-1}  // q15  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,17     ,-1     ,-1     ,-1}  // q16  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,18     ,-1     ,OK}  // q17  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q18  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,20     ,-1     ,OK}  // q19  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q20  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,22     ,-1     ,-1     ,-1}  // q21  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,23     ,-1     ,OK}  // q22  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q23  =
                ,{25     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q24  =
                ,{-1     ,-1     ,-1     ,-1     ,26     ,-1     ,-1     ,-1     ,-1     ,-1     ,40     ,43     ,38     ,-1     ,-1     ,-1}  // q25  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,27     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q26  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,28     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q27  =
                ,{-1     ,-1     ,-1     ,-1     ,29     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q28  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,30     ,35     ,33     ,-1     ,-1     ,-1}  // q29  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,31     ,-1     ,-1     ,-1}  // q30  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,32     ,-1     ,OK}  // q31  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q32  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,34     ,-1     ,OK}  // q33  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q34  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,36     ,-1     ,-1     ,-1}  // q35  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,37     ,-1     ,OK}  // q36  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q37  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,39     ,-1     ,OK}  // q38  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q39  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,41     ,-1     ,-1     ,-1}  // q40  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,42     ,-1     ,OK}  // q41  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q42  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,44     ,-1     ,-1     ,-1}  // q43  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,45     ,-1     ,OK}  // q44  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q45  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,47     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q46  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,48     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q47  =
                ,{-1     ,-1     ,-1     ,-1     ,49     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1}  // q48  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,53     ,50     ,-1     ,-1     ,52     ,OK}  // q49  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,51     ,-1}  // q50  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q51  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q52  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,54     ,-1}  // q53  =
                ,{-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,-1     ,OK}  // q54  =
    };

    
    private int getIndexAlfabeto(char c) {
        switch(c) {
            case 'f': return 0;
            case 'o': return 1;
            case 'r': return 2;
            case 'i': return 3;
            case 'e': return 4;
            case 'l': return 5;
            case 's': return 6;
            case 'a': return 7;
            case 'c': return 8;
            case 'h': return 9;
            case ' ': return 10;
            case '\t': return 11;
            case '(': return 12;
            case ')': return 13;
            case '{': return 14;
            case '\n': return 15;
            default: return -1;
        }
    }

    private boolean buscarCaminoAOK(int estadoActual, int columna) {
        if (estadoActual == OK) {
            return true;
        }
        if (estadoActual == ER) {
            return false;
        }
        
        int siguienteEstado = m[estadoActual][columna];
        return buscarCaminoAOK(siguienteEstado, columna);
    }

    public void validarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una línea de texto:");
        String linea = scanner.nextLine();
        
        boolean esValida = validarLinea(linea);
        
        if (esValida) {
            System.out.println("Entrada válida: '" + linea + "'");
        } else {
            System.out.println("Entrada no válida");
        }
    }
    
    private boolean validarLinea(String linea) {
        int estadoActual = 0;
        
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            int columna = getIndexAlfabeto(c);
            
            if (columna == -1) {
                return false;
            }
            
            estadoActual = m[estadoActual][columna];
            
            if (estadoActual == ER) {
                return false;
            }
        }
        
        int columnaNewLine = getIndexAlfabeto('\n');
        return estadoActual == OK || m[estadoActual][columnaNewLine] == OK;
    }
}