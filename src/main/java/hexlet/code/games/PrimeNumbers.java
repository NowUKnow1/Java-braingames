package hexlet.code.games;

import java.util.Random;

public final class PrimeNumbers implements Game {

    private static final int MAX_NUMBER = 101;
    private static final String PRIME = "yes";
    private static final String NOT_PRIME = "no";
    private static final String GAME_NAME = "Prime Numbers";
    private static final String GAME_GOAL = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public String getName() {
        return GAME_NAME;
    }

    public String getGoal() {
        return GAME_GOAL;
    }

    public String[] getAnswerAndQuestion() {

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
        answerAndQuestion[0] = (checkForPrime) ? PRIME : NOT_PRIME;
        answerAndQuestion[1] = Integer.toString(randomNumber);

        return answerAndQuestion;
    }
}
