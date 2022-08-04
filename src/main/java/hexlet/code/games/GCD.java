package hexlet.code.games;

import java.util.Random;

public final class GCD implements Game {

    private static final int MAX_NUMBER = 100;
    private static final String GAME_NAME = "GCD";
    private static final String GAME_GOAL = "Find the greatest common divisor of given numbers.";

    public String getName() {
        return GAME_NAME;
    }

    public String getGoal() {
        return GAME_GOAL;
    }

    public String[] getAnswerAndQuestion() {

        int gcd = 0;
        Random random = new Random();
        int firstNumber = random.nextInt(MAX_NUMBER) + 1;
        int secondNumber = random.nextInt(MAX_NUMBER) + 1;

        for (int j = 1; j <= firstNumber && j <= secondNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                gcd = j;
            }
        }

        String[] answerAndQuestion = new String[2];
        answerAndQuestion[0] = Integer.toString(gcd);
        answerAndQuestion[1] = firstNumber + " " + secondNumber;

        return answerAndQuestion;
    }
}

