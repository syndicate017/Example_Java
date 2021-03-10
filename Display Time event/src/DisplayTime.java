import java.util.Scanner;
import java.util.Scanner.*;


public class DisplayTime {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user for input*/
        System.out.print("Enter an integer for seconds: ");
        long seconds = input.nextLong();

        /*Find minutes in seconds*/
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60; /*Seconds remaining*/

        /*Show results*/
        System.out.println(seconds + " seconds is " + minutes +
        " minutes and " + remainingSeconds + " seconds");
    }
}
