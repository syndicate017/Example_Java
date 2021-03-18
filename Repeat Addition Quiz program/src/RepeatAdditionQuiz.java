import java.util.*;


public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Generate random numbers*/
        long number1 = (long) (Math.random() * 10);
        long number2 = (long) (Math.random() * 10);

        /*Create a question*/
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        long answer = input.nextLong();

        /*Check the answer*/
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again, what is " +
                    number1 + " + " + number2 + "? ");
            answer = input.nextLong();
        }
        System.out.println("You got it!");
    }
}
