package hexlet.code;

import java.util.Random;
import java.util.Arrays;

public class Progression implements Engine{
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
        String[] arrayForQuestion = new String[maxNumbersInProgression];
        for (int k = 0; k < maxNumbersInProgression; k++) {
            int[] neededNumber = Arrays.copyOfRange(numbersInProgression, k,k + 1);
            arrayForQuestion[k] = Arrays.toString(neededNumber);
            if (k == hiddenNumberInProgression) {
                arrayForQuestion[k] = "..";
            }
        }
        System.out.println("Question: " + Arrays.toString(arrayForQuestion));
        return Integer.toString(correctAnswer);
        }
}

