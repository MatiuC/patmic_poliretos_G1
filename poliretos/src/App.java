import GrafosAutomatas.Automata03;

public class App {
    public static void main(String[] args) {
        String filename ="src/assets/data.txt";
        Automata03 automata = new Automata03();
        automata.processFile(filename);
    }
}