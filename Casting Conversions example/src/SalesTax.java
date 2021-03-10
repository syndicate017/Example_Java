import java.util.*;


public class SalesTax {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user for input*/
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = input.nextDouble();

        /*Perform casting conversions for double to integer type
        * If the purchase amount is 197.55 then
          tax * 100 is 1185.3
          (int)(tax * 100) is 1185
          (int)(tax * 100) / 100.0 is 11.85*/
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
