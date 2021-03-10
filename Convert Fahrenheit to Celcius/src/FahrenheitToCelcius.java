import java.util.*;


public class FahrenheitToCelcius {
    public static void main(String[] args) {
        /*Create Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user for input*/
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        /*Convert Fahrenheit to Celcius*/
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
        celcius + " in Celcius");
    }
}
