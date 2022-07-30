package hexlet.code.Games;


import java.util.Random;

public class Calc implements Game {

    final int maxFirstNumber = 101;
    final int maxSecondNumber = 101;
    final int neededNumberOfOperations = 3;

    int firstNumber = 0;

    int secondNumber = 0;

    int chooseMath = 0;

    int answer = 0;

    public String getName() {
        return "Calc";
    }

    public String getGoal() {
        return "What is the result of the expression?";
    }

    public String getAnswerAndQuestion() {
        Random random = new Random();
        firstNumber = random.nextInt(maxFirstNumber);
        secondNumber = random.nextInt(maxSecondNumber);
        chooseMath = random.nextInt(neededNumberOfOperations) + 1;
        switch (chooseMath) {
            case 1 -> {
                System.out.println("Question: " + firstNumber + " + " + secondNumber);
                answer = firstNumber + secondNumber;
            }
            case 2 -> {
                System.out.println("Question: " + firstNumber + " - " + secondNumber);
                answer = firstNumber - secondNumber;
            }
            case 3 -> {
                System.out.println("Question: " + firstNumber + " * " + secondNumber);
                answer = firstNumber * secondNumber;
            }
        }
        return Integer.toString(answer);
    }
}
