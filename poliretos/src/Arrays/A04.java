package Arrays;

public class A04 {
    public void executeA04(String nombre, String apellido){
        

        String input;
        int length;
        if (nombre.length() >= apellido.length()) {
            input = nombre;
            length = nombre.length();
        } else {
            input = apellido;
            length = apellido.length();
        }

        char[][] matrix = new char[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
            if (i == j && i < nombre.length()) {
                matrix[i][j] = nombre.charAt(i);
            } else if (i + j == length - 1 && i < apellido.length()) {
                matrix[i][j] = apellido.charAt(i);
            } else {
                matrix[i][j] = ' ';
            }
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
            System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
