package hexlet.code.games;
import java.util.Random;
public class EvenNumbers implements Game {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final int MAX_NUMBER = 100;
    private static final String GAME_NAME = "Even Numbers";
    private static final String GAME_GOAL = "Answer 'yes' if number yes otherwise answer 'no'.";
    public final String getName() {
        return GAME_NAME;
    }
    public final String getGoal() {
        return GAME_GOAL;
    }
    public final String[] getAnswerAndQuestion() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        String[] answerAndQuestion = new String[2];
        answerAndQuestion[1] = Integer.toString(randomNumber);
        if (randomNumber % 2 == 0) {
            answerAndQuestion[0] = YES;
        } else {
            answerAndQuestion[0] = NO;
        }
        return answerAndQuestion;
    }
}
