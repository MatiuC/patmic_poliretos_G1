package Loading;
import java.util.Random;

public class L10 {
  private final int LONGITUD_BARRA = 20;
  private final String RESET = "\u001B[0m";
  private final String VERDE = "\u001B[32m";
  private int tamanoArchivo; 
  
  public void g1_iniciar() {
      Random random = new Random();
      tamanoArchivo = random.nextInt(91) + 10; 
      
      System.out.println("Downloading ArchivoYar1-win_amd64.whl (" + tamanoArchivo + " kB)");
      
      for (double descargado = 0; descargado <= tamanoArchivo; descargado += 0.5) {
          mostrarBarra(descargado);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  
  private void mostrarBarra(double descargado) {
      int porcentaje = (int)((descargado * 100) / tamanoArchivo);
      int caracteresLlenos = (porcentaje * LONGITUD_BARRA) / 100;
      
      StringBuilder barra = new StringBuilder("[");
      barra.append(VERDE); 
      
    
      for (int i = 0; i < caracteresLlenos; i++) {
          barra.append("=");
      }
      
      barra.append(RESET); 
      
     
      for (int i = caracteresLlenos; i < LONGITUD_BARRA; i++) {
          barra.append(" ");
      }
      
      barra.append("] ");
      
      String progreso = String.format("%.1f / %.1f kB", descargado, (double)tamanoArchivo);
      
      System.out.print("\r" + barra + progreso);
      
      if (descargado >= tamanoArchivo) {
          System.out.println();
      }
  }
}