package hexlet.code.games;


import java.util.Random;

public class Calc implements Game {

    private final int maxFirstNumber = 101;
    private final int maxSecondNumber = 101;
    private final int neededNumberOfOperations = 3;
    private final int addition = 1;
    private final int subtraction = 2;
    private final int multiply = 3;
    private final String gameName= "Calc";
    private final String gameGoal= "What is the result of the expression?";
    public final String getName() {
        return gameName;
    }

    public final String getGoal() {
        return gameGoal;
    }
    public final String[] getAnswerAndQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxFirstNumber);
        int secondNumber = random.nextInt(maxSecondNumber);
        int chooseMath = random.nextInt(neededNumberOfOperations) + 1;
        String[] answerAndQuestion = new String[2];
        switch (chooseMath) {
            case addition -> {
                answerAndQuestion[1] = "Question: " + firstNumber + " + " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber + secondNumber);
            }
            case subtraction -> {
                answerAndQuestion[1] = "Question: " + firstNumber + " - " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber - secondNumber);
            }
            case multiply -> {
                answerAndQuestion[1] = "Question: " + firstNumber + " * " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber * secondNumber);
            }
            default -> {
                System.out.println("Whoops");
            }
        }
        return answerAndQuestion;
    }
}
