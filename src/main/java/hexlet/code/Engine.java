package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;
final class Engine {
    private final int questionsToWin = 3;

    private final int questionsToLose = 1;

    private String userName = "";

    private Scanner scanner = new Scanner(System.in);

    public void start(Game game) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        String goal = game.getGoal();
        System.out.println(goal);
        int rightAnswers = 0;
        int wrongAnswers = 0;
        String checkAnswer = "";
        String answer = "";

        while (rightAnswers < questionsToWin && wrongAnswers < questionsToLose) {
            String[] answerAndQuestion = game.getAnswerAndQuestion();
            checkAnswer = answerAndQuestion[0];
            System.out.println(answerAndQuestion[1]);
            System.out.print("Your answer: ");
            answer = scanner.next().toLowerCase();
            if (answer.equals(checkAnswer)) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                wrongAnswers++;
            }
        }
        if (rightAnswers == questionsToWin) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                    + "Correct answer was '" + checkAnswer + "'. "
                    + "Let's try again, " + userName + "!");
        }
    }
}
