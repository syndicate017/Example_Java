import java.util.*;


public class AnalyzeNumbers {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter the total items*/
        System.out.print("Enter the Total Items: ");
        int n = input.nextInt();

        /*Create array variable*/
        double[] numbers = new double[n];
        double sum = 0;

        /*Prompt the user to enter the number lists*/
        System.out.print("Enter the Number Lists: ");
        /*Store numbers in array*/
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        /*Declare the variable to get the average*/
        double average = sum / n;
        /*Check the average*/
        int count = 0; /*The numbers of elements above the average*/
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        /*Display results*/
        System.out.println("The Average of All Number is " + average);
        System.out.println("The Number of Elements above the average is " +
                count + " items");
    }
}
