package hexlet.code;

import hexlet.code.Games.Game;

import java.util.Scanner;
final class Engine {
    private final int questionsToWin = 3;

    private final int questionsToLose = 1;

    private String userName = "";

    private Scanner scanner = new Scanner(System.in);

/*    private Game game;

    Engine(Game game) {
        this.game = game;
    }*/
    public void start(Game game) {
        System.out.println("Welcome to the Brain Games!");
        userName = Cli.getName();
        System.out.println("Hello, " + userName + "!");
        String goal = game.getGoal();
        System.out.println(goal);
        int rightAnswers = 0;
        int wrongAnswers = 0;
        String checkAnswer = "";
        String answer = "";

        while (rightAnswers < questionsToWin && wrongAnswers < questionsToLose) {
            checkAnswer = game.getAnswerAndQuestion();
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
    /*public String getName(Game game){
         return game.getName();
    }*/
}
