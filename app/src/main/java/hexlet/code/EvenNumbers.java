package hexlet.code;

import java.util.Scanner;

public class EvenNumbers implements Engine {
    @Override
    public String start() {
        return Engine.super.start();
    }

    public String game() {
        int maxNumbers = 100;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int randomNumber = (int) (Math.random() * maxNumbers);
        System.out.println("Question: " + randomNumber);
        int checkAnswer = randomNumber % 2;
        if (checkAnswer == 1) {
            return "no";
        } else {
            return "yes";
        }
    }
}
