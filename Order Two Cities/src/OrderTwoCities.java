import java.util.*;


public class OrderTwoCities {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter two cities*/
        System.out.println("Enter the First City: ");
        String city1 = input.nextLine();
        System.out.println("Enter the Second City: ");
        String city2 = input.nextLine();

        /*Create the rules*/
        if (city1.compareTo(city2) < 0) {
            System.out.println("The Cities in alphabetical order are: " + city1 + " , " + city2 + ".");
        }
        else System.out.println("The Cities in alphabetical order are: " + city2 + " , " + city1 + ".");
    }
}
