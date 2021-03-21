public class TestPassByValue {
    public static void main(String[] args) {
        /*Declare and initialize the variable*/
        long num1 = 1;
        long num2 = 2;

        /*Display results*/
        System.out.println("Before invoking the Swap Method, num1 is " +
                num1 + " and num2 is " + num2);

        /*Invoke the swap method to attempt to swap two variables*/
        swap(num1, num2);

        /*Display results*/
        /*False swap*/
        System.out.println("After invoking the Swap Method, num1 is " +
                num1 + " and num2 is " + num2);
    }

    /*Create new method and rules*/
    /*Swap two variables*/
    public static void swap(long n1, long n2) {
        /*Display results*/
        System.out.println("\tInside the Swap Method");
        System.out.println("\t\tBefore Swapping, n1 is " +
                n1 + " and n2 is " + n2);

        /*Swap n1 with n2*/
        long temp = n1;
        n1 = n2;
        n2 = temp;

        /*Display results*/
        System.out.println("\t\tAfter Swapping, n1 is " +
                n1 + " and n2 is " + n2);

    }
}
