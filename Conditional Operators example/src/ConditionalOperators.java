import java.util.*;


public class ConditionalOperators {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter the number*/
        System.out.println("Enter the number you choose: ");

        /*Create the rules*/
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        /*Using the Conditional Operators method*/
        System.out.println((x < y && y < z ? "Sorted" : "Not Sorted"));
    }
}
