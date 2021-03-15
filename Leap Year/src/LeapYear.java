import java.util.*;


public class LeapYear {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to insert the year*/
        System.out.print("Enter a year: ");
        long year = input.nextLong();

        /*Check if the year is a leap year using the formula*/
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        /*Display results*/
        System.out.println(year + " is a Leap Year ? " + isLeapYear);
    }
}
