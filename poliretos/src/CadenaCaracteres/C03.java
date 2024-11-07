package CadenaCaracteres;
import java.util.Scanner;

public class C03 {
    public void g1_eliminarVocal() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la frase: ");
        String frase = sc.nextLine();
        
        System.out.print("Ingrese la vocal a eliminar: ");
        char vocal = sc.next().charAt(0);
        
        vocal = Character.toLowerCase(vocal);
        
        StringBuilder resultado = new StringBuilder();
        
        for(int i = 0; i < frase.length(); i++) {
            char caracterActual = Character.toLowerCase(frase.charAt(i));
            
            if(caracterActual != vocal) {
                resultado.append(frase.charAt(i));
            }
        }
        
        System.out.println("Resultado: " + resultado.toString());
    }
}
