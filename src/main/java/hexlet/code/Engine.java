package hexlet.code;

import hexlet.code.Games.Game;

import java.util.Scanner;

 final public class Engine {
    int questionToWin = 3;

    int questionToLose = 1;

    String userName = "";

    Scanner scanner = new Scanner(System.in);

    Game game;

     public Engine(Game game) {
         this.game = game;
     }
     public void start() {
         System.out.println("Welcome to the Brain Games!");
         userName = Cli.getName();
         System.out.println("Hello, " + userName + "!");
         String goal = game.getGoal();
         System.out.println(goal);
         int rightAnswers = 0;
         int wrongAnswers = 0;
         String checkAnswer = "";
         String answer = "";

        while (rightAnswers < questionToWin && wrongAnswers < questionToLose) {
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
        if (rightAnswers == questionToWin) {
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
