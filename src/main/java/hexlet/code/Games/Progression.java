package hexlet.code.Games;

import java.util.Random;
import java.util.Arrays;

public class Progression implements Game {

    private final int minNumberPlus = 6;
    private final int minNumbersInProgression = 6;
    private final int maxNumberInProgression = 100;
    private Random random = new Random();

    private int maxNumbersInProgression = random.nextInt(minNumberPlus) + minNumbersInProgression;

    private int correctAnswer = 0;
    private int[] numbersInProgression = new int[maxNumbersInProgression];
    private final int maxStep = 10;
    public final String getName() {
        return "Progression";
    }

    public final String getGoal() {
        return "What number is missing in the progression?";
    }
    public final String getAnswerAndQuestion() {
        int firstNumberInProgression = random.nextInt(maxNumberInProgression);
        int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
        int stepOfProgression = random.nextInt(maxStep) + 1;

        for (int j = 0; j < maxNumbersInProgression; j++) {
            numbersInProgression[j] = firstNumberInProgression + stepOfProgression * j;
            if (j == hiddenNumberInProgression) {
                correctAnswer = numbersInProgression[j];
            }
        }
        String[] arrayForQuestion = new String[maxNumbersInProgression];
        for (int k = 0; k < maxNumbersInProgression; k++) {
            if (k == hiddenNumberInProgression) {
                arrayForQuestion[k] = "..";
            } else {
                arrayForQuestion[k] = String.valueOf(firstNumberInProgression + stepOfProgression * k);
            }
        }
        String question = Arrays.toString(arrayForQuestion);
        question = question.replaceAll(",", "").replace("[", "").replace("]", "");
        System.out.println("Question: " + question);
        return Integer.toString(correctAnswer);
    }
}

