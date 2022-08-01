package hexlet.code.Games;

import java.util.Random;
import java.util.Arrays;

public class Progression implements Game{

    final int minNumberPlus = 6;
    final int minNumbersInProgression = 6;
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

