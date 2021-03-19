import java.util.*;


public class TestDoWhile {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Read an initial data*/
        long data;
        long sum = 0;

        /*Keep reading the data until the input is 0*/
        do {
            /*Read the next data*/
            System.out.print("Enter an integer (The input ends if it is 0): ");
            data = input.nextLong();

            /*Execute the data*/
            sum += data;
        } while (data != 0);

        /*Display results*/
        System.out.println("The sum is " + sum);
    }
}
