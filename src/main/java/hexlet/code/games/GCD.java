package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final int maxNumbers = 100;
    private final String gameName = "GCD";
    private final String gameGoal = "Find the greatest common divisor of given numbers.";
    public final String getName() {
        return gameName;
    }

    public final String getGoal() {
        return gameGoal;
    }

    public final String[] getAnswerAndQuestion() {
        int gcd = 0;
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumbers) + 1;
        int secondNumber = random.nextInt(maxNumbers) + 1;
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        for (int j = 1; j <= firstNumber && j <= secondNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                gcd = j;
            }
        }
        String[] answerAndQuestion = new String[2];
        answerAndQuestion[0] = Integer.toString(gcd);
        answerAndQuestion[1] = "Question: " + firstNumber + " " + secondNumber;
        return answerAndQuestion;
    }
}

