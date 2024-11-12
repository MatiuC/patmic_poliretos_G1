package Loading;

public class L08 {
    public void L08_G1(String nombre, String apellido){
        String fullName = nombre + " " + apellido;
        int length = fullName.length();
        StringBuilder display = new StringBuilder();

        for (int i = 0; i < length; i++) {
            display.append(fullName.charAt(i));
            int percentage = (i + 1) * 100 / length;
            System.out.print("\r[" + display.toString() + "] " + percentage + "%");
            try {
                Thread.sleep(500); //carga de 0.5 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Carga interrumpida");
                return;
            }
        }
        System.out.println("\n100% Listo!!");
    }
}
