import java.util.*;


public class LotteryUsingStrings {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);
        /*Prompt the user to enter a guess*/
        System.out.print("Enter your Lottery pick (Two-Digits): ");
        String guess = input.nextLine();

        /*Generate a lottery as a two-digit string*/
        String lottery = "" + (long) (Math.random() * 10) +
                (long) (Math.random() * 10);

        /*Get digits from lottery*/
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        /*Get digits from guess*/
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The Lottery number is " + lottery);

        /*Check the guess*/
        if (guess.equals(lottery)) {
            System.out.println("Exact match: You win $10.000");
        }
        else if (guessDigit1 == lotteryDigit2 &&
                guessDigit2 == lotteryDigit1) {
            System.out.println("Match all Digits: You win $3.000");
        }
        else if (guessDigit1 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1) {
            System.out.println("Match one Digit: You win $1.000");
        }
        else {
            System.out.println("Sorry, No Match. You Lose!");
        }

    }
}
