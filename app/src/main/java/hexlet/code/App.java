package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even numbers");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.println("Your choice: "); int gameNumber = sc.nextInt();
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            final String gameGreet = Cli.getName();
            System.out.println("Hello, " + gameGreet + "!");
        } else if (gameNumber == 2) {
            final String gameEvenNumbers = EvenNumbers.gameEvenNumbers();
            System.out.println(gameEvenNumbers);
        } else if (gameNumber == 3) {
            final String calc = Calc.calc();
            System.out.println(calc);
        } else if (gameNumber == 4) {
            final String gcd = GCD.gcd();
            System.out.println(gcd);
        } else if (gameNumber == 0) {
            System.out.println("The Champ is here");
        }
    }

}
