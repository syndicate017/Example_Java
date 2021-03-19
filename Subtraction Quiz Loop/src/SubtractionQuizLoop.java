import java.util.*;


public class SubtractionQuizLoop {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Creates the variable cores*/
        final long NUMBER_OF_QUESTIONS = 5;
        long correctCount = 0;
        long count = 0;

        /*Initial an empty String*/
        String output = " ";

        /*Initialize the time spent for answer*/
        long starTime = System.currentTimeMillis();

        /*Create the header text*/
        System.out.println("Subtraction Quiz using While Loops method!\n");

        /*Create the rules of program loops*/
        while (count < NUMBER_OF_QUESTIONS) {
            /*1. Generate tworandom single-digit integers*/
            long number1 = (long) (Math.random() * 10);
            long number2 = (long) (Math.random() * 10);

            /*2. If number1 < number2, swap position of number1 with number2*/
            if (number1 < number2) {
                long temp = number1;
                number1 = number2;
                number2 = temp;
            }

            /*3. Prompt the student to answer "What is number1 - number 2?*/
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            long answer = input.nextLong();

            /*4. Grade the answer and display the results*/
            if (number1 - number2 == answer) {
                System.out.println("You are correct.\n");
            correctCount++;
            }
            else System.out.println("Your answer is wrong!\n" +
                    number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
            count++;

            /*Prepare the output results*/
            output += "\n" + number1 + " - " + number2 + " = " + answer +
                ((number1 - number2 == answer) ? " (Correct answer)" : " (Wrong answer)");
        }

        /*Initialize the time spent for answer*/
        long endTime = System.currentTimeMillis();
        long testTime = endTime - starTime;

        /*Show the results*/
        System.out.println("Correct count is: " + correctCount +
                "\nTest time is: " + testTime / 1000 + " seconds\n" +
                output);
    }
}
