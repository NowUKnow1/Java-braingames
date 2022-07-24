package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Progression {
    public static String progression() {
        int rightAnswersInARow = 3;
        System.out.println("Welcome to the Brain Games!");
        final String game = Cli.getName();
        System.out.println("Hello, " + game + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        Scanner answer = new Scanner(System.in);
        for (int i = 0; i < rightAnswersInARow;) {
            int maxNumbersInProgression = random.nextInt(6) + 5;
            int firstNumberInProgression = random.nextInt(100);
            int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
            int stepOfProgression = random.nextInt(10) + 1;
            int correctAnswer = 0;
            int[] numbersInProgression = new int[maxNumbersInProgression];
            for (int j = 0; j < maxNumbersInProgression; j++) {
                numbersInProgression[j] = firstNumberInProgression + stepOfProgression * j;
                if (j == hiddenNumberInProgression) {
                    correctAnswer = numbersInProgression[j];
                }
            }
            String[] arrayForQuestion = new String[maxNumbersInProgression];
            for (int k = 0; k < maxNumbersInProgression; k++) {
                int[] neededNumber = Arrays.copyOfRange(numbersInProgression, k,k + 1);
                arrayForQuestion[k] = Arrays.toString(neededNumber);
                if (k == hiddenNumberInProgression) {
                    arrayForQuestion[k] = "..";
                }
            }
            System.out.println("Question: " + Arrays.toString(arrayForQuestion));
            int answerUser = answer.nextInt();
            if (answerUser == correctAnswer) {
                System.out.println("Correct!");
                i++;
            } else {
                return "'" + answerUser + "'" + "is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'."
                        + "Let's try again, " + game;
            }
        }
        return "Congratulations, " + game;
    }
}
