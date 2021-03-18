import java.util.*;


public class GuessNumber {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);
        /*Create the massage header*/
        System.out.println("Guess a Magic Number between 0 and 100");

        /*Generate a random number to be guessed*/
        long number = (long) (Math.random() * 101);

        /*Enter a guess*/
        long guess = -1;
        while (guess != number) {
            /*Prompt the user to guess the number*/
            System.out.print("\nEnter your guess: ");
            guess = input.nextLong();

            /*Check the guess*/
            if (guess == number) {
                System.out.println("Yes, the Magic Number is " + number);
            }
            else if (guess > number) {
                System.out.println("Your Number guess is too high");
            }
            else System.out.println("Your Number guess is too low");
            /*End of the loop*/
        }
    }
}
