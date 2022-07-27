package hexlet.code;

import java.util.Random;

public class Calc implements Engine {
    public String game() {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        int firstNumber = random.nextInt(101);
        int secondNumber = random.nextInt(101);
        int chooseMath = random.nextInt(3) + 1;
        int rightAnswer = 0;
        if (chooseMath == 1) {
            rightAnswer = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber);
        } else if (chooseMath == 2) {
            rightAnswer = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber);
        } else if (chooseMath == 3) {
            rightAnswer = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber);
        }
        return Integer.toString(rightAnswer);
    }
}
