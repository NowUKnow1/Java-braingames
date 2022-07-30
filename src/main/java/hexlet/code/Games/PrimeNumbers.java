package hexlet.code.Games;

import java.util.Random;

public class PrimeNumbers implements Game {

    String answer = "";

    int randomNumber = 0;

    public String getName() {
        return "Prime Numbers";
    }

    public String getGoal() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getAnswerAndQuestion() {
        final int maxNumbers = 101;
        final String prime = "yes";
        final String notPrime = "no";
        Random random = new Random();
        randomNumber = random.nextInt(maxNumbers);
        System.out.println("Question: " + randomNumber);
        if (randomNumber % 2 == 0 || randomNumber % 3 == 0 || randomNumber % 5 == 0 || randomNumber % 7 == 0) {
            answer = notPrime;
        } else {
            answer = prime;
        }
        return answer;
    }
}


