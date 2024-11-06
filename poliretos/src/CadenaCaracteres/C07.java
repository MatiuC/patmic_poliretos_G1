package CadenaCaracteres;
import java.util.Scanner;

public class C07 {
    public void g1_convertirSinJ() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la frase: ");
        String frase = sc.nextLine();
        
        StringBuilder resultado = new StringBuilder();
        
        for(int i = 0; i < frase.length(); i++) {
            char caracterActual = Character.toUpperCase(frase.charAt(i));
            
            if(caracterActual != 'J') {
                resultado.append(caracterActual);
            }
        }
        
        System.out.println("Resultado: " + resultado.toString());
    }
}
