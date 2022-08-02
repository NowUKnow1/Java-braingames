package hexlet.code.games;

import java.util.Random;

public class PrimeNumbers implements Game {
    private final int maxNumbers = 101;
    private final String prime = "yes";
    private final String notPrime = "no";
    private final String gameName= "Prime Numbers";
    private final String gameGoal= "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public final String getName() {
        return gameName;
    }
    public final String getGoal() {
        return gameGoal;
    }
    public final String[] getAnswerAndQuestion() {
        String checkForPrime = "true";
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumbers);
        for (int i = 2; i < randomNumber; i++) {
            int checkNumber = randomNumber % i;
            if (checkNumber == 0) {
                checkForPrime = "false";
                break;
            }
        }
        String[] answerAndQuestion = new String[2];
        if (checkForPrime.equals("true")) {
            answerAndQuestion[0] = prime;
        } else {
            answerAndQuestion[0] = notPrime;
        }
        answerAndQuestion[1] = "Question: " + randomNumber;
        return answerAndQuestion;
    }
}
