package CadenaCaracteres;

public class g1_crearCadenaCaracter {
    //Metodo para contar las letras de una frase
    public void cadenaCaracter02(String[] args) {
        if (args.length == 0) {
            System.out.println("No se proporcionó ninguna frase.");
            return;
        }
        String frase = args[0];
        int contadorConsonantes = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (esConsonante(letra)) {
                contadorConsonantes++;
            }
        }

        System.out.println("La frase tiene " + contadorConsonantes + " letras");
    }
    public boolean esConsonante(char letra) {
        String vocales = "aeiouAEIOU"; 
        return Character.isLetter(letra) && !vocales.contains(String.valueOf(letra));
    }
    // Metodo para invertir la frase y convertir a mayúsculas
    public void invertirFrase(String[] args) {
        if (args.length == 0) {
            System.out.println("No se proporcionó ninguna frase.");
            return;
        }

        String frase = args[0];
        int longitud = frase.length();
        char[] fraseInvertida = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            char letra = frase.charAt(longitud - 1 - i);
            if (esConsonante(letra)) {
                fraseInvertida[i] = (char) (letra - 'a' + 'A'); 
            } else {
                fraseInvertida[i] = letra; 
            }
        }

        
        System.out.print("Frase invertida: ");
        for (char c : fraseInvertida) {
            System.out.print(c);
        }
        System.out.println(); 
    }
}
