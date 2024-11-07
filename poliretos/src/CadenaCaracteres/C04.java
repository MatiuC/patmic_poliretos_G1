package CadenaCaracteres;

import java.util.Scanner;


public class C04 {
    public void cFrase04 (){
        //Pedir una frase y una letra, eliminar la letra ingresada de la frase.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce una frase: ");
            String frase = sc.nextLine();
            System.out.println("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            String nuevaFrase = "";
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) != letra) {
                    nuevaFrase += frase.charAt(i);
                }
            }
            System.out.println("La frase sin la letra " + letra + " es: " + nuevaFrase);
            sc.close();
        }
        
    }
}
