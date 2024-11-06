package Loading;
import java.util.Scanner;

public class L02 {
  private final int LONGITUD_BARRA = 20;
  private char caracterCarga;
  
  public void g1_iniciar() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el carácter para la barra de progreso: ");
      caracterCarga = scanner.next().charAt(0);
      
      for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
          mostrarBarra(porcentaje);
          try {
              Thread.sleep(200); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  
  private void mostrarBarra(int porcentaje) {
      int caracteresLlenos = (porcentaje * LONGITUD_BARRA) / 100;
      
      StringBuilder barra = new StringBuilder("[");
      
      for (int i = 0; i < LONGITUD_BARRA; i++) {
          if (i < caracteresLlenos) {
              barra.append(caracterCarga);
          } else {
              barra.append(" ");
          }
      }
      barra.append("] ").append(porcentaje).append("%");
      
      System.out.print("\r" + barra);
      
      if (porcentaje == 100) {
          System.out.println();
      }
  }
}