package extras;

import java.util.Scanner;

public class ScannerUtil {
    public static void closeScanner(Scanner scanner) {
        if (scanner != null) {
            scanner.close();
        }
    }
}
