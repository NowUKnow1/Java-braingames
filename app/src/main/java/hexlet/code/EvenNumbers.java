package hexlet.code;

import java.util.Scanner;

public class EvenNumbers {
    public static String gameEvenNumbers() {
        int maxNumbers = 100;
        int rightAnswersInARow = 3;
        System.out.println("Welcome to the Brain Games!");
        final String game = Cli.getName();
        System.out.println("Hello, " + game + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < rightAnswersInARow;) {
            int randomNumber = (int) (Math.random() * maxNumbers);
            System.out.println("Question: " + randomNumber);
            Scanner answer = new Scanner(System.in);
            String answerUser = answer.next();
            System.out.println("Your answer: " + answerUser);
            int checkAnswer = randomNumber % 2;
            String rightAnswer;
            if (checkAnswer == 1) {
                rightAnswer = "no";
            } else {
                rightAnswer = "yes";
            }
            answerUser = answerUser.toLowerCase();
            if (answerUser.equals(rightAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answerUser + "'" + "is wrong answer ;(. "
                                    + "Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + game);
                i = 0;
            }
        }
        return "Congratulations, " + game;
    }
}
