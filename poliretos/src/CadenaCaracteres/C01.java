package CadenaCaracteres;



public class C01 {
    public void cadena1(String frase) {
        System.out.println("Encuentra las vocales de una frase:");
        int cont = 0; //cont: contador de vocales 
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }
}
