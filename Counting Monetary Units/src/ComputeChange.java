import java.util.*;


public class ComputeChange {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Receive the amount*/
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        /*Show the remaining amount*/
        long remainingAmount = (long) (amount * 100);

        /*Find the number of one dollars*/
        long numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        /*Find the number of quarters int the remaining amount*/
        long numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        /*Find the number of dimes in the remaining amount*/
        long numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        /*Find the number of nickels in the remaining amount*/
        long numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        /*Find the number of pennies in the remaining amount*/
        long numberOfPennies = remainingAmount;

        /*Display results*/
        System.out.println("Your amount " + amount + "consist of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
