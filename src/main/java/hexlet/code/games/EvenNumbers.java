package hexlet.code.games;
import java.util.Random;
public class EvenNumbers implements Game {
    private final String even = "yes";
    private final String odd = "no";
    private final int maxNumbers = 100;
    private final String gameName= "Even Numbers";
    private final String gameGoal= "Answer 'yes' if number even otherwise answer 'no'.";
    public final String getName() {
        return gameName;
    }
    public final String getGoal() {
        return gameGoal;
    }
    public final String[] getAnswerAndQuestion() {
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumbers) + 1;
        String[] answerAndQuestion = new String[2];
        answerAndQuestion[1] = "Question: " + randomNumber;
        if (randomNumber % 2 == 0) {
            answerAndQuestion[0] = even;
        } else {
            answerAndQuestion[0] = odd;
        }
        return answerAndQuestion;
    }
}
