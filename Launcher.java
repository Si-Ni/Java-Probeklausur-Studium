package structure;

import java.util.Scanner;

/**
 * Die Startklasse.
 */
public class Launcher {

    /**
     * Die Einstiegsmethode.
     * 
     * @param args die Kommandozeilenargumente
     */
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
        String o = "";
        int a = 0;
        int b = 0;
        int r = 0;
	String quit = "n";

        while (quit.equals("n")) {

            System.out.print("Operand a: ");
            a = s.nextInt();
            System.out.print("Operand b: ");
            b = s.nextInt();
            System.out.print("Operation: ");
            o = s.next();

            switch (o) {
            
                case "+":
                    r = a + b;
                    break;
                case "-":
                    r = a - b;
                    break;
                case "*":
                    r = a * b;
                    break;
                case "/":
                    r = a / b;
                    break;
                default:
                    ;
            }

            System.out.println("Ergebnis: " + r);

            System.out.print("Programm beenden? (j/n) ");
            quit = s.next();
        }

        s.close();
    }
}
