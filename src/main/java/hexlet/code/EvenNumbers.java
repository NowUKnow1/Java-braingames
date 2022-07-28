package hexlet.code;

public class EvenNumbers extends Engine {
    @Override
    public String getName() {
        return "Even Numbers";
    }

    public String game() {
        final String even = "yes";
        final String odd = "no";
        int maxNumbers = 100;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int randomNumber = (int) (Math.random() * maxNumbers);
        System.out.println("Question: " + randomNumber);
        int checkAnswer = randomNumber % 2;
        if (checkAnswer == 0) {
            return even;
        } else {
            return odd;
        }
    }
}
