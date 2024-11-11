package Loading;
import java.util.Random;

public class L11 {
    /**
     * - Rojo: "\u001B[31m"
     * - Verde: "\u001B[32m"
     * - Amarillo: "\u001B[33m"
     * - Azul: "\u001B[34m"
     * - Magenta: "\u001B[35m"
     * - Cian: "\u001B[36m"
     */
    public void L11_G1(){
        Random random = new Random();
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
        String resetColor = "\u001B[0m";
        
        for (int j = 0; j < 6; j++) {
            int height = random.nextInt(15);
            String color = colors[random.nextInt(colors.length)];
            for (int i = 0; i < height; i++) {
            System.out.print(color + "=" + resetColor);
            try {
                Thread.sleep(100); // 100 milliseconds delay to simulate sound effect
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            }
            System.out.println();
        }
    }
}
