package Loading;
public class L06 {
  private final int LONGITUD_BARRA = 20;
  private final String INDICADOR = "<=>";
  
  public void g1_iniciar() {
      for (int posicion = 0; posicion <= LONGITUD_BARRA - INDICADOR.length(); posicion++) {
          mostrarBarra(posicion);
          try {
              Thread.sleep(200); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  
  private void mostrarBarra(int posicion) {
      StringBuilder barra = new StringBuilder("[");
      
      for (int i = 0; i < LONGITUD_BARRA; i++) {
          if (i == posicion) {
              barra.append(INDICADOR);
              i += INDICADOR.length() - 1; 
          } else {
              barra.append(" ");
          }
      }
      

      int porcentaje = (posicion * 100) / (LONGITUD_BARRA - INDICADOR.length());
      
      barra.append("] ").append(porcentaje).append("%");
      
      System.out.print("\r" + barra);
      
      if (posicion == LONGITUD_BARRA - INDICADOR.length()) {
          System.out.println();
      }
  }
}