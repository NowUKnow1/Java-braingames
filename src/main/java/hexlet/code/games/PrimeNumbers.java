package hexlet.code.games;

import java.util.Random;

public class PrimeNumbers implements Game {
    private static final int MAX_NUMBER = 101;
    private static final String PRIME = "yes";
    private static final String NOT_PRIME = "no";
    private static final String GAME_NAME = "Prime Numbers";
    private static final String GAME_GOAL = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public final String getName() {
        return GAME_NAME;
    }
    public final String getGoal() {
        return GAME_GOAL;
    }
    public final String[] getAnswerAndQuestion() {
        boolean checkForPrime = true;
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER);
        for (int i = 2; i < randomNumber; i++) {
            int checkNumber = randomNumber % i;
            if (checkNumber == 0) {
                checkForPrime = false;
                break;
            }
        }
        String[] answerAndQuestion = new String[2];
        if (checkForPrime) {
            answerAndQuestion[0] = PRIME;
        } else {
            answerAndQuestion[0] = NOT_PRIME;
        }
        answerAndQuestion[1] = "Question: " + randomNumber;
        return answerAndQuestion;
    }
}
