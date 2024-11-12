package CadenaCaracteres;

public class C04 {
    public void cFrase04(String frase, char letra) {
        // Eliminar la letra ingresada de la frase.
        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                nuevaFrase += frase.charAt(i);
            }
        }
        System.out.println("La frase sin la letra " + letra + " es: " + nuevaFrase);
    }
}
