package Figuras;

public class F7 {
 public void figura7(int c) {
        System.out.print("Escalones hacia la derecha: ");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j < i; j++) {    // espacios para alinear el escalón en diagonal
                System.out.print("     ");
            }
            System.out.println("___");    // imprimir la línea horizontal del escalón
            for (int j = 1; j < i; j++) {// espacios para alinear el soporte vertical
                System.out.print("     ");
            }
            System.out.println("   |");      // imprimir el soporte vertical del escalón
        }
    }
}
