import java.util.*;


public class SentinelValue {
    public static void main(String[] args) {
        /*Create a Scanner*/
        Scanner input = new Scanner(System.in);

        /*Read an initial data*/
        System.out.print("Enter an integer (The input ends if it is 0): ");
        long data = input.nextLong();

        /*Keep reading data until the input is 0*/
        long sum = 0;
        while (data != 0) {
            sum += data;

            /*Read the next data*/
            System.out.print("Enter an integer (The input ends if it is 0): ");
            data = input.nextLong();
        }

        System.out.println("The sum is " + sum);
    }
}
