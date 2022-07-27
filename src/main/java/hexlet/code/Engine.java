package hexlet.code;

import java.util.Scanner;

interface Engine {
    int questionToWin = 3;

    int questionToLose = 1;

    Scanner scanner = new Scanner(System.in);

    default String start() {
        System.out.println("Welcome to the Brain Games!");
        final String userName = Cli.getName();
        System.out.println("Hello, " + userName + "!");
        int rightAnswers = 0;
        int wrongAnswers = 0;
        String checkAnswer = "";
        String answer = "";

        while (rightAnswers < questionToWin && wrongAnswers < questionToLose) {
            checkAnswer = game();
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
            System.out.println("Congratulations, " + userName);
        } else {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                    + "Correct answer was '" + checkAnswer + "'."
                    + "Let's try again, " + userName);
        }
        return "Congrats!";
    }
    String game();
}
