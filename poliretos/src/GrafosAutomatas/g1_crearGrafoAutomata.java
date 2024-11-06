package GrafosAutomatas;

public class g1_crearGrafoAutomata {

    // A04: Método para validar si un número es decimal
    public boolean esNumeroDecimal(String input) {
        boolean tienePunto = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '.') {
                if (tienePunto) {
                    return false;
                }
                tienePunto = true;
            } else if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return tienePunto; 
    }

    // A05: Método para validar una declaración de variable en Java
    public boolean esDeclaracionVariableValida(String input) {
        if (input.isEmpty() || (!Character.isLetter(input.charAt(0)) && input.charAt(0) != '_' && input.charAt(0) != '$')) {
            return false;
        }
        
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_' && c != '$' && c != '=' && c != ';' && c != ',') {
                return false;
            }
        }
        char ultimoCaracter = input.charAt(input.length() - 1);
        return ultimoCaracter == ';' || ultimoCaracter == ',' || ultimoCaracter == '=';
    }
}
