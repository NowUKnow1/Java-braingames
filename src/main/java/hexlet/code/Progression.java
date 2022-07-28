package hexlet.code;

import java.util.Random;
import java.util.Arrays;

public class Progression extends Engine {

    public String getName() {
        return "Progression";
    }
    public String game() {
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        int maxNumbersInProgression = random.nextInt(6) + 5;
        int firstNumberInProgression = random.nextInt(100);
        int hiddenNumberInProgression = random.nextInt(maxNumbersInProgression);
        int stepOfProgression = random.nextInt(10) + 1;
        int correctAnswer = 0;
        int[] numbersInProgression = new int[maxNumbersInProgression];
        for (int j = 0; j < maxNumbersInProgression; j++) {
            numbersInProgression[j] = firstNumberInProgression + stepOfProgression * j;
            if (j == hiddenNumberInProgression) {
                correctAnswer = numbersInProgression[j];
            }
        }
        String arrayForQuestion = "";
        for (int k = 0; k < maxNumbersInProgression; k++) {
            String stepByStepGettingQuestion = Arrays.toString(new int[]{numbersInProgression[k]});
            if (k == hiddenNumberInProgression) {
                arrayForQuestion = arrayForQuestion +  ".., ";
            } else {
                arrayForQuestion = arrayForQuestion + ", " + stepByStepGettingQuestion;
            }
        }
        System.out.println("Question: " + arrayForQuestion);
        return Integer.toString(correctAnswer);
    }
}

