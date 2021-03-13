import java.util.*;


public class SimpleIfDemo {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to input*/
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        /*Check HiFive number's rule*/
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        /*Check Even number's rule*/
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
