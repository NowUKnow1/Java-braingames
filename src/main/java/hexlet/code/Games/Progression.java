package hexlet.code.Games;

import java.util.Random;
import java.util.Arrays;

public class Progression implements Game{

    final int minNumberPlus = 6;
    final int minNumbersInProgression = 5;
    final int maxNumberInProgression = 100;
    Random random = new Random();

    int maxNumbersInProgression = random.nextInt(minNumberPlus) + minNumbersInProgression;

    int correctAnswer = 0;
    int[] numbersInProgression = new int[maxNumbersInProgression];

    public String getName() {
        return "Progression";
    }

    public String getGoal() {
        return "What number is missing in the progression?";
    }
    public String getAnswerAndQuestion() {
        int firstNumberInProgression = random.nextInt(maxNumberInProgression);
        int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
        int stepOfProgression = random.nextInt(10) + 1;

        for (int j = 0; j < maxNumbersInProgression; j++) {
            numbersInProgression[j] = firstNumberInProgression + stepOfProgression * j;
            if (j == hiddenNumberInProgression) {
                correctAnswer = numbersInProgression[j];
            }
        }
        StringBuilder arrayForQuestion = new StringBuilder();
        for (int k = 0; k < maxNumbersInProgression; k++) {
            String stepByStepGettingQuestion = Arrays.toString(new int[]{numbersInProgression[k]});
            if (k == hiddenNumberInProgression) {
                arrayForQuestion.append(".. ");
            } else {
                arrayForQuestion.append(" ").append(stepByStepGettingQuestion);
            }
        }
        System.out.println("Question: " + arrayForQuestion);
        return Integer.toString(correctAnswer);
    }
}

