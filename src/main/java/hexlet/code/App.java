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
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        for (Map.Entry<Integer, Engine> game : games.entrySet()) {
            System.out.println(game.getKey() + ". " + game.getValue().getName());
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                final String game = Cli.getName();
                System.out.println("Hello, " + game + "!");
            case 0:
                System.out.println("The champ is here");
            case 2, 3, 4, 5, 6:
                games.get(gameNumber).start();
            default:
                System.out.println("Input correct game number!");
        }


    }
}
