package hexlet.code.games;
import java.util.Random;
import java.util.StringJoiner;

public final class Progression implements Game {

    private static final int MIN_NUMBER_PLUS = 6;
    private static final int MIN_NUMBERS_IN_PROGRESSION = 6;
    private static final int MAX_NUMBER_IN_PROGRESSION = 100;
    private static final int MAX_STEP = 10;
    private static final String GAME_NAME = "Progression";
    private static final String GAME_GOAL = "What number is missing in the progression?";

    public String getName() {
        return GAME_NAME;
    }

    public String getGoal() {
        return GAME_GOAL;
    }

    public String[] getAnswerAndQuestion() {

        Random random = new Random();
        int maxNumbersInProgression = random.nextInt(MIN_NUMBER_PLUS) + MIN_NUMBERS_IN_PROGRESSION;
        StringJoiner arrayForQuestion = new StringJoiner(" ");
        int firstNumberInProgression = random.nextInt(MAX_NUMBER_IN_PROGRESSION);
        int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
        int stepOfProgression = random.nextInt(MAX_STEP) + 1;
        String[] answerAndQuestion = new String[2];

        for (int j = 0; j < maxNumbersInProgression; j++) {
            if (j == hiddenNumberInProgression) {
                answerAndQuestion[0] = Integer.toString(firstNumberInProgression + stepOfProgression * j);
                arrayForQuestion.add("..");
            } else {
                arrayForQuestion.add(String.valueOf(firstNumberInProgression + stepOfProgression * j));
            }
        }

        String question = arrayForQuestion.toString();
        answerAndQuestion[1] = question;

        return answerAndQuestion;
    }
}

