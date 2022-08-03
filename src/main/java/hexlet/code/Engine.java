package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;
public final class Engine {
    private static final int QUESTIONS_TO_WIN = 3;

    private static final int QUESTIONS_TO_LOSE = 1;
    public static void play(Game game) {
        System.out.println("Welcome to the Brain Games!");
        Scanner usersInput = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = usersInput.next();
        System.out.println("Hello, " + userName + "!");
        String goal = game.getGoal();
        System.out.println(goal);
        int rightAnswers = 0;
        int wrongAnswers = 0;
        String correctAnswer = "";
        String inputAnswer = "";

        while (rightAnswers < QUESTIONS_TO_WIN && wrongAnswers < QUESTIONS_TO_LOSE) {
            String[] answerAndQuestion = game.getAnswerAndQuestion();
            correctAnswer = answerAndQuestion[0];
            System.out.println("Question: " + answerAndQuestion[1]);
            System.out.print("Your inputAnswer: ");
            inputAnswer = usersInput.next().toLowerCase();
            if (inputAnswer.equals(correctAnswer)) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                wrongAnswers++;
            }
        }
        if (rightAnswers == QUESTIONS_TO_WIN) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + inputAnswer + "'" + "is wrong inputAnswer ;(. "
                    + "Correct inputAnswer was '" + correctAnswer + "'. "
                    + "Let's try again, " + userName + "!");
        }
    }
}
