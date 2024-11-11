package Loading;

public class L04 {
    public void L04_G1() {

        // Simulate loading progress
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
            System.out.print("\ro0o " + i + "%");
            } else if (i % 3 == 0) {
            System.out.print("\roo0 " + i + "%");
            } else {
            System.out.print("\r0oo " + i + "%");
            }
            try {
            Thread.sleep(100); // Adjust the speed of the loading simulation
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
        System.out.println("\nCarga Completa!");
    }
}
