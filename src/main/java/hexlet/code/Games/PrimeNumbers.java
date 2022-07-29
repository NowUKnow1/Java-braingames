package hexlet.code;

import java.util.Random;

public class PrimeNumbers extends Engine{

    public String getName() {
        return "Prime Numbers";
    }
    public String game() {
        int maxNumbers = 100;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("Question: " + randomNumber);
        if (randomNumber % 2 == 0 || randomNumber % 3 == 0 || randomNumber % 5 == 0 || randomNumber % 7 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}

