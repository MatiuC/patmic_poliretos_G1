package CadenaCaracteres;
public class C05 {
public void cadena5(String frase) {
        System.out.print("Invierte una frase:  ");

        StringBuilder fraseInvertida = new StringBuilder();// Invertir la frase y convertir vocales a mayúsculas
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {  // Convertir vocales a mayúsculas
                fraseInvertida.append(Character.toUpperCase(letra));
            } else {
                fraseInvertida.append(letra);
            }
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
}
