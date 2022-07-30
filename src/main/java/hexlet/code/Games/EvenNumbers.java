package hexlet.code.Games;

import java.util.Random;

public class EvenNumbers implements Game {

    final String even = "yes";
    final String odd = "no";

    Random random = new Random();

    final int maxNumbers = 100;

    String answer = "";


    public String getName() {
        return "Even Numbers";
    }

    public String getGoal() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public String getAnswerAndQuestion() {
        int randomNumber = random.nextInt(maxNumbers) + 1;
        System.out.println("Question: " + randomNumber);
        if (randomNumber % 2 == 0) {
            answer = even;
        } else {
            answer = odd;
        }
        return answer;
    }
}
