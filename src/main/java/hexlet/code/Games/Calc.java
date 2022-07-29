package hexlet.code;

import java.util.Random;

public class Calc extends Engine {

    public String getName() {
        return "Calc";
    }
    public String game() {
        int maxFirstNumber = 101;
        int maxSecondNumber = 101;
        int neededNumberOfOperations = 3;
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        int firstNumber = random.nextInt(maxFirstNumber);
        int secondNumber = random.nextInt(maxSecondNumber);
        int chooseMath = random.nextInt(neededNumberOfOperations) + 1;
        switch (chooseMath) {
            case 1:
                System.out.println(firstNumber + " + " + secondNumber);
                return Integer.toString(firstNumber + secondNumber);
            case 2:
                System.out.println(firstNumber + " - " + secondNumber);
                return Integer.toString(firstNumber - secondNumber);
            case 3:
                System.out.println(firstNumber + " * " + secondNumber);
                return Integer.toString(firstNumber * secondNumber);
            default:
                return null;
        }
    }
}
