import java.util.*;


public class TestBooleanOperators {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Receive an input*/
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        /*Create the example rules*/
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
    }
}
