package CadenaCaracteres;

public class C09 {
public void cadena9(String frase) {

        System.out.print("Cambia cada letra por una mayúscula o minúscula de una frase:");
        @SuppressWarnings("resource")
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado.append(Character.toUpperCase(letra)); // Letras en mayúscula para índices pares
            } else {
                resultado.append(Character.toLowerCase(letra)); // Letras en minúscula para índices impares
            }
        }
        System.out.println("La frase final es: " + resultado);
    }
}
