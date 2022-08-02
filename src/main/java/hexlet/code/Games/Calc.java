package hexlet.code.Games;


import java.util.Random;

public class Calc implements Game {

    private final int maxFirstNumber = 101;
    private final int maxSecondNumber = 101;
    private final int neededNumberOfOperations = 3;

    private final int addition = 1;
    private final int subtraction = 2;
    private final int multiply = 3;

    private int firstNumber = 0;

    private int secondNumber = 0;

    private int chooseMath = 0;

    private int answer = 0;

    public final String getName() {
        return "Calc";
    }

    public final String getGoal() {
        return "What is the result of the expression?";
    }

    public final String getAnswerAndQuestion() {
        Random random = new Random();
        firstNumber = random.nextInt(maxFirstNumber);
        secondNumber = random.nextInt(maxSecondNumber);
        chooseMath = random.nextInt(neededNumberOfOperations) + 1;
        switch (chooseMath) {
            case addition -> {
                System.out.println("Question: " + firstNumber + " + " + secondNumber);
                answer = firstNumber + secondNumber;
            }
            case subtraction -> {
                System.out.println("Question: " + firstNumber + " - " + secondNumber);
                answer = firstNumber - secondNumber;
            }
            case multiply -> {
                System.out.println("Question: " + firstNumber + " * " + secondNumber);
                answer = firstNumber * secondNumber;
            }
            default -> {
                System.out.println("Whoops");
            }
        }
        return Integer.toString(answer);
    }
}
