import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text;

        System.out.println("Whats your name, man?");
        text = scan.next();
        System.out.print("well.. " + text + " its nice to meet you");
        scan.close();
    }
}