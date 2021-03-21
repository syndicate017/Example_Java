import java.util.*;


public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter two integers*/
        System.out.print("Enter the first Integer: ");
        long n1 = input.nextLong();
        System.out.print("Enter the second Integer: ");
        long n2 = input.nextLong();

        /*Invoke the gcd method*/
        /*Display results*/
        System.out.println("The Greatest Common Divisor (GCD) for " +
                n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    /*Create a new method gcd*/
    /*Return the gcd of two integers*/
    public static long gcd(long n1, long n2) {
        long gcd = 1; /*Initial gcd value is 1*/
        long k = 2; /*Possible value of gcd*/

        /*Create the rules*/
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; /*Update gcd value*/
            }
            k++;
        }
        return gcd; /*Return the gcd value*/
    }
}
