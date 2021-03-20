import java.util.*;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter two integers*/
        System.out.print("Enter the first integer: ");
        long n1 = input.nextLong();
        System.out.print("Enter the second integer: ");
        long n2 = input.nextLong();

        /*Create the rules of program*/
        long gcd = 1; /*Initial gcd is 1*/
        long k = 2; /*Possible gcd*/

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; /*Update gcd value*/
            }
            k++;
        }

        /*Display results*/
        System.out.println("The Greatest Common Divisor (GCD) for " +
                n1 + " and " + n2 + " is " + gcd);

    }
}
