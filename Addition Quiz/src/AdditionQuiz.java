import java.util.*;


public class AdditionQuiz {
    public static void main(String[] args) {
        long number1 = (long)(System.currentTimeMillis() % 10);
        long number2 = (long)(System.currentTimeMillis() / 10 % 10);

        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Show the questions*/
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        /*Receive the answer*/
        long answer = input.nextLong();

        /*Display result*/
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                (number1 + number2 == answer));
    }
}
