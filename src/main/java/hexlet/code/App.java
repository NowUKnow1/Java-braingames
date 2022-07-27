package hexlet.code;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static  final Map<Integer, Engine> games = new LinkedHashMap<>() {{
        put(2, new EvenNumbers());
        put(3, new Calc());
        put(4, new GCD());
        put(5, new Progression());
        put(6, new PrimeNumbers());
    }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I Have your name?");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even numbers");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime numbers");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            final String game = Cli.getName();
            System.out.println("Hello, " + game + "!");
        } else if (gameNumber == 0) {
            System.out.println("The champ is here");
        } else if (gameNumber == 2 || gameNumber == 3 || gameNumber == 4 || gameNumber == 5 || gameNumber == 6) {
            games.get(gameNumber).start();
        } else {
            System.out.println("Input correct game number!");
        }


    }
}
