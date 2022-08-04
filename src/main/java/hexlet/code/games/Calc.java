package hexlet.code.games;


import java.util.Random;

public final class Calc implements Game {

    private static final int MAX_FIRST_NUMBER = 101;
    private static final int MAX_SECOND_NUMBER = 101;
    private static final int NEEDED_NUMBER_OF_OPERATIONS = 3;
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLY = 3;
    private static final String GAME_NAME = "Calc";
    private static final String GAME_GOAL = "What is the result of the expression?";

    public String getName() {
        return GAME_NAME;
    }

    public String getGoal() {
        return GAME_GOAL;
    }

    public String[] getAnswerAndQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(MAX_FIRST_NUMBER);
        int secondNumber = random.nextInt(MAX_SECOND_NUMBER);
        int chooseMath = random.nextInt(NEEDED_NUMBER_OF_OPERATIONS) + 1;

        String[] answerAndQuestion = new String[2];

        switch (chooseMath) {
            case ADDITION -> {
                answerAndQuestion[1] = firstNumber + " + " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber + secondNumber);
            }
            case SUBTRACTION -> {
                answerAndQuestion[1] = firstNumber + " - " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber - secondNumber);
            }
            case MULTIPLY -> {
                answerAndQuestion[1] = firstNumber + " * " + secondNumber;
                answerAndQuestion[0] = Integer.toString(firstNumber * secondNumber);
            }
            default -> {
                System.out.println("Whoops");
            }
        }
        return answerAndQuestion;
    }
}
