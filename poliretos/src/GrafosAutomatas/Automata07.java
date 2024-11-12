package GrafosAutomatas;
import java.util.Scanner;

public class Automata07 {
    final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + 
                           "abcdefghijklmnopqrstuvwxyz" + 
                           "0123456789" +
                           "!@#$%^&*()";
    final int OK = 999;  
    final int ER = -1;   

    
    int[][] m = new int[5][4];  

    private int getTipoCaracter(char c) {
        if (Character.isUpperCase(c)) return 0;
        if (Character.isLowerCase(c)) return 1;
        if (Character.isDigit(c)) return 2;
        if ("!@#$%^&*()".indexOf(c) >= 0) return 3;
        return -1;
    }

    public Automata07() {
        m = new int[][] {
            {1,  ER, ER, ER},    //q0
            {1,  2,  ER, ER},    //q1
            {2,  2,  3,  ER},    //q2
            {3,  3,  3,  OK},    //q3 
            {OK, OK, OK, OK}     //q4 
        };
    }

    public void validarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una contraseña:");
        String password = scanner.nextLine();
        
        boolean esValida = validarPassword(password);
        
        if (esValida) {
            System.out.println("Contraseña válida!");
        } else {
            System.out.println("Contraseña no válida - debe contener al menos:\n" +
                             "- Una letra mayúscula\n" +
                             "- Una letra minúscula\n" +
                             "- Un número\n" +
                             "- Un caracter especial");
        }
    }
    
    private boolean validarPassword(String password) {
        int estado = 0; 
        
        for (char c : password.toCharArray()) {
            int tipo = getTipoCaracter(c);
            if (tipo == -1) return false; 
            estado = m[estado][tipo];
            if (estado == ER) return false;
        }
        
        return estado == OK;
    }

    public static void main(String[] args) {
        Automata07 validador = new Automata07();
        validador.validarEntrada();
    }
}