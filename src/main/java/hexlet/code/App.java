package hexlet.code;


import hexlet.code.games.Game;
import hexlet.code.games.EvenNumbers;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.PrimeNumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    private static final Engine GAME_ENGINE = new Engine();

    private static final Engine GAME_ENGINE = new Engine();

    private static  final Map<Integer, Game> GAMES = new LinkedHashMap<>() {{
            put(EVEN, new EvenNumbers());
            put(CALC, new Calc());
            put(GCD, new GCD());
            put(PROGRESSION, new Progression());
            put(PRIME, new PrimeNumbers());
        }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        for (Map.Entry<Integer, Game> game : GAMES.entrySet()) {
            System.out.println(game.getKey() + " - " + game.getValue().getName());
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();
        switch (gameNumber) {
            case 0 -> System.out.println("The champ is here");
            case 1 -> {
                System.out.println("Welcome to the Brain Games!");
                String game = Cli.getName();
                System.out.println("Hello, " + game + "!");
            }
            case EVEN, CALC, GCD, PROGRESSION, PRIME -> GAME_ENGINE.start(GAMES.get(gameNumber));
            default -> System.out.println("Input correct game number!");
        }

    }

}
