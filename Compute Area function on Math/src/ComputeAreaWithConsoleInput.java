import java.util.*; /*Scanner is in the java.util package*/

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        /*Create a Scanner object*/
        Scanner input = new Scanner(System.in);

        /*Declare a constant*/
        final double PI = 3.14159;

        /*Prompt the user to enter a radius*/
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        /*Compute area*/
        if (radius >= 0) {
            double area = radius * radius * PI;
            System.out.println("The area for the circle of radius " +
                    radius + " is " + area);
        } else {
            System.out.println("Negative input");
        }
    }
}
