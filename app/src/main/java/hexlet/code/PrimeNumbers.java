package hexlet.code;

import java.util.Random;

public class PrimeNumbers implements Engine{
    public String game() {
        int maxNumbers = 100;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("Question: " + randomNumber);
        if (randomNumber == 2 || randomNumber == 3 || randomNumber == 5 || randomNumber == 7 || randomNumber == 11 || randomNumber == 13 || randomNumber == 17 || randomNumber == 19 || randomNumber == 23 || randomNumber == 29 || randomNumber == 31 || randomNumber == 37 || randomNumber == 41 ||randomNumber == 43 || randomNumber == 47 || randomNumber == 53 || randomNumber == 59 || randomNumber == 61 || randomNumber == 67 || randomNumber == 71
        || randomNumber == 73 || randomNumber == 79 || randomNumber == 83 || randomNumber == 89 || randomNumber == 97) {
            return "yes";
        } else {
            return "no";
        }
    }
}

