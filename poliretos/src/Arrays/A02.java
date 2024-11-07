package Arrays;
import java.util.Scanner;

public class A02 {
    public void g1_matrizIniciales(int tamano) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreCompleto = sc.nextLine();
        
        // Separar nombre y apellido y obtener iniciales
        String[] partes = nombreCompleto.split(" ");
        char inicial1 = partes[0].toUpperCase().charAt(0);
        char inicial2 = partes[1].toUpperCase().charAt(0);
        
        char[][] matriz = new char[tamano][tamano * 2 + 1];
        
        // Llenar la matriz con espacios en blanco
        for(int i = 0; i < tamano; i++) {
            for(int j = 0; j < tamano * 2 + 1; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        // Primera letra
        dibujarLetra(matriz, inicial1, 0, tamano);
        // Segunda letra
        dibujarLetra(matriz, inicial2, tamano + 1, tamano);
        
        // Mostrar la matriz
        System.out.println("\nMatriz con iniciales " + inicial1 + inicial2 + ":");
        for(int i = 0; i < tamano; i++) {
            for(int j = 0; j < tamano * 2 + 1; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private void dibujarLetra(char[][] matriz, char letra, int offset, int tamano) {
        for(int i = 0; i < tamano; i++) {
            for(int j = 0; j < tamano; j++) {
                switch(letra) {
                    case 'A':
                        if(j == 0 || j == tamano-1 || i == 0 || i == tamano/2) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'B':
                        if(j == 0 || i == 0 || i == tamano-1 || i == tamano/2 ||
                           (j == tamano-1 && i != 0 && i != tamano/2 && i != tamano-1)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'C':
                        if(j == 0 || i == 0 || i == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'D':
                        if(j == 0 || (j == tamano-1 && i != 0 && i != tamano-1) || 
                           i == 0 || i == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'E':
                        if(j == 0 || i == 0 || i == tamano/2 || i == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'F':
                        if(j == 0 || i == 0 || i == tamano/2) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'G':
                        if(j == 0 || i == 0 || i == tamano-1 || 
                           (j == tamano-1 && i >= tamano/2) ||
                           (i == tamano/2 && j >= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'H':
                        if(j == 0 || j == tamano-1 || i == tamano/2) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'I':
                        if(i == 0 || i == tamano-1 || j == tamano/2) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'J':
                        if(i == 0 || (j == tamano/2 && i < tamano-1) ||
                           (i == tamano-1 && j < tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'K':
                        if(j == 0 || (Math.abs(j - i) == tamano/2) ||
                           (i + j == tamano-1 && i >= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'L':
                        if(j == 0 || i == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'M':
                        if(j == 0 || j == tamano-1 || 
                           (i == j && i <= tamano/2) ||
                           (i + j == tamano-1 && i <= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'N':
                        if(j == 0 || j == tamano-1 || i == j) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'O':
                        if((j == 0 && i != 0 && i != tamano-1) ||
                           (j == tamano-1 && i != 0 && i != tamano-1) ||
                           (i == 0 && j != 0 && j != tamano-1) ||
                           (i == tamano-1 && j != 0 && j != tamano-1)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'P':
                        if(j == 0 || i == 0 || i == tamano/2 ||
                           (j == tamano-1 && i < tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'Q':
                        if((j == 0 && i < tamano-2) ||
                           (j == tamano-1 && i < tamano-2) ||
                           (i == 0 && j < tamano-1) ||
                           (i == tamano-2 && j < tamano-1) ||
                           (i == j && i >= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'R':
                        if(j == 0 || i == 0 || i == tamano/2 ||
                           (j == tamano-1 && i < tamano/2) ||
                           (i-j == tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'S':
                        if(i == 0 || i == tamano/2 || i == tamano-1 ||
                           (j == 0 && i < tamano/2) ||
                           (j == tamano-1 && i > tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'T':
                        if(i == 0 || j == tamano/2) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'U':
                        if((j == 0 && i != tamano-1) ||
                           (j == tamano-1 && i != tamano-1) ||
                           (i == tamano-1 && j != 0 && j != tamano-1)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'V':
                        if((j == i/2) || (j + i/2 == tamano-1)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'W':
                        if(j == 0 || j == tamano-1 ||
                           (i == j+tamano/2 && i >= tamano/2) ||
                           (i+j == tamano-1+tamano/2 && i >= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'X':
                        if(i == j || i + j == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'Y':
                        if((i == j && i <= tamano/2) ||
                           (i + j == tamano-1 && i <= tamano/2) ||
                           (j == tamano/2 && i >= tamano/2)) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                    case 'Z':
                        if(i == 0 || i == tamano-1 || i + j == tamano-1) {
                            matriz[i][j + offset] = '*';
                        }
                        break;
                }
            }
        }
    }
}
