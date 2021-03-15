import java.util.*;


public class Lottery {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);
        /*Prompt the user to enter the guess numbers*/
        System.out.print("Enter your Lottery pick (Two Digits): ");
        long guess = input.nextLong();

        /*Generate a lottery number*/
        long lottery = (long) (Math.random() * 100);

        /*Get digits from lottery*/
        long lotteryDigit1 = lottery / 10;
        long lotteryDigit2 = lottery % 10;

        /*Get digits from guess input*/
        long guessDigit1 = guess / 10;
        long guessDigit2 = guess % 10;

        System.out.println("The Lottery number is " + lottery);

        /*Check the guess input*/
        if (guess == lottery) {
            System.out.println("Exact match: You win $10.000");
        } else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: You win $3.000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: You win $1.000");
        }
        else System.out.println("Sorry, no match. You Lose!");
    }
}
