package hexlet.code;

import java.util.Random;

public class GCD extends Engine {
    @Override
    public String getName() {
        return "GCD";
    }


    public String game() {
        int maxNumbers = 100;
        int gcd = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumbers) + 1;
        int secondNumber = random.nextInt(maxNumbers) + 1;
        for (int j = 1; j <= firstNumber && j <= secondNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                gcd = j;
            }
        }
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        return Integer.toString(gcd);
    }
}

