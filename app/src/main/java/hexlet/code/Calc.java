package hexlet.code;

import java.util.Random;

import java.util.Scanner;

public class Calc {
    public static String calc() {
        int rightAnswersInARow = 3;
        System.out.println("Welcome to the Brain Games!");
        final String game = Cli.getName();
        System.out.println("Hello, " + game + "!");
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        Scanner answer = new Scanner(System.in);
        for (int i = 0; i < rightAnswersInARow;){
            int firstNumber = random.nextInt(101);
            int secondNumber = random.nextInt(101);
            int chooseMath = random.nextInt(3) + 1;
            if (chooseMath == 1) {
                int rightAnswer = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber);
                int answerUser = answer.nextInt();
                System.out.println("Your answer: " + answerUser);
                if (rightAnswer == answerUser) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    return "'" + answerUser + "'" + "is wrong answer ;(. "
                            + "Correct answer was '" + rightAnswer + "'."
                            + "Let's try again, " + game;
                }
            }
            if (chooseMath == 2) {
                int rightAnswer = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber);
                int answerUser = answer.nextInt();
                System.out.println("Your answer: " + answerUser);
                if (rightAnswer == answerUser) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    return "'" + answerUser + "'" + "is wrong answer ;(. "
                            + "Correct answer was '" + rightAnswer + "'."
                            + "Let's try again, " + game;
                }
            }
            if (chooseMath == 3) {
                int rightAnswer = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber);
                int answerUser = answer.nextInt();
                System.out.println("Your answer: " + answerUser);
                if (rightAnswer == answerUser) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    return "'" + answerUser + "'" + "is wrong answer ;(. "
                            + "Correct answer was '" + rightAnswer + "'."
                            + "Let's try again, " + game;
                }
            }
        }
        return "Congratulations, " + game;
    }

}
