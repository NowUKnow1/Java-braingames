package hexlet.code.games;
import java.util.Random;
import java.util.Arrays;
public class Progression implements Game {
    private final int minNumberPlus = 6;
    private final int minNumbersInProgression = 6;
    private final int maxNumberInProgression = 100;
    private final int maxStep = 10;
    private final String gameName = "Progression";
    private final String gameGoal = "What number is missing in the progression?";
    public final String getName() {
        return gameName;
    }
    public final String getGoal() {
        return gameGoal;
    }
    public final String[] getAnswerAndQuestion() {
        Random random = new Random();
        int correctAnswer = 0;
        int maxNumbersInProgression = random.nextInt(minNumberPlus) + minNumbersInProgression;
        int[] numbersInProgression = new int[maxNumbersInProgression];
        String[] arrayForQuestion = new String[maxNumbersInProgression];
        int firstNumberInProgression = random.nextInt(maxNumberInProgression);
        int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
        int stepOfProgression = random.nextInt(maxStep) + 1;

        for (int j = 0; j < maxNumbersInProgression; j++) {
            numbersInProgression[j] = firstNumberInProgression + stepOfProgression * j;
            if (j == hiddenNumberInProgression) {
                correctAnswer = numbersInProgression[j];
                arrayForQuestion[j] = "..";
            } else {
                arrayForQuestion[j] = String.valueOf(firstNumberInProgression + stepOfProgression * j);
            }
        }
        String question = Arrays.toString(arrayForQuestion);
        question = question.replaceAll(",", "").replace("[", "").replace("]", "");
        System.out.println("Question: " + question);
        String[] answerAndQuestion = new String[2];
        answerAndQuestion[0] = Integer.toString(correctAnswer);
        answerAndQuestion[1] = "Question: " + question;
        return answerAndQuestion;
    }
}

