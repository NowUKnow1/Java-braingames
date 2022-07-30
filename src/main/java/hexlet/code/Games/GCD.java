package hexlet.code.Games;

import java.util.Random;

public class GCD implements Game {
    final int maxNumbers = 100;

    public String getName() {
        return "GCD";
    }

    public String getGoal() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getAnswerAndQuestion() {
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
        return Integer.toString(gcd);
    }
}

