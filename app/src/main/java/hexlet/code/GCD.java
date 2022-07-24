package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static String gcd() {
        int maxNumbers = 100;
        int rightAnswersInARow = 3;
        int gcd = 0;
        System.out.println("Welcome to the Brain Games!");
        final String game = Cli.getName();
        System.out.println("Hello, " + game + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        Scanner answer = new Scanner(System.in);
        for (int i = 0; i < rightAnswersInARow;) {
            int firstNumber = random.nextInt(maxNumbers) + 1;
            int secondNumber = random.nextInt(maxNumbers) + 1;
            for (int j = 1; j <= firstNumber && j <= secondNumber; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    gcd = j;
                }
            }
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            int answerUser = answer.nextInt();
            System.out.println("Your answer: " + answerUser);
            if (gcd == answerUser) {
                System.out.println("Correct!");
                i++;
            } else {
                return "'" + answerUser + "'" + "is wrong answer ;(. "
                        + "Correct answer was '" + gcd + "'."
                        + "Let's try again, " + game;
            }
        }
        return "Congratulations, " + game;
    }
}
