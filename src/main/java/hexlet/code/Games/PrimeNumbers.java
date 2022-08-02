package hexlet.code.Games;

import java.util.Random;

public class PrimeNumbers implements Game {

    private static final String prime = "yes";
    private static final String notPrime = "no";

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;

    public final String getName() {
        return "Prime Numbers";
    }

    public final String getGoal() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public final String getAnswerAndQuestion() {
        final int maxNumbers = 101;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumbers);
        System.out.println("Question: " + randomNumber);
        if (randomNumber % TWO == 0 || randomNumber % THREE == 0 || randomNumber % FIVE == 0 || randomNumber % SEVEN == 0) {
            return notPrime;
        } else {
            return prime;
        }
    }

}


