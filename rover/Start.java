package rover;

import java.io.PrintStream;

public class Start {

        private PrintStream out;

    public static void main(String[] args) {
        PrintStream out = System.out;
        Map map = new Map();
        map.print(out);
        map.move();
        map.print(out);
        map.turn();
        map.move();
        map.move();
        map.print(out);
    }
}
