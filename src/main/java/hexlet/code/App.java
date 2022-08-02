package hexlet.code;


import hexlet.code.Games.Game;
import hexlet.code.Games.EvenNumbers;
import hexlet.code.Games.Calc;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.PrimeNumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;

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
/*
            case EVEN, CALC, GCD, PROGRESSION, PRIME -> new Engine(GAMES.get(gameNumber)).start();
*/
            default -> System.out.println("Input correct game number!");
        }


    }
}
