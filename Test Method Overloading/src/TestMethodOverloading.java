public class TestMethodOverloading {
    public static void main(String[] args) {
        /*Main method*/
        /*Invoke the max method with int parameters*/
        System.out.println("The Maximum value of 3 and 4 is " +
                max(3, 4));

        /*Invoke the max method with double parameters*/
        System.out.println("The Maximum value of 3.0 and 5.4 is " +
                max(3.0, 5.4));

        /*Invoke the max method with three double parameters*/
        System.out.println("The Maximum value of 3.0, 5.4, and 10.14 is " +
                max(3.0, 5.4, 10.14));

    }

    /*Create a new overloaded max method for int variable type*/
    /*Return the max of two int values*/
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else return num2;
    }

    /*Create a new overloaded max method for two double variable type*/
    /*Return the max of two double values*/
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else return num2;
    }

    /*Create a new overloaded max method for three double variable type*/
    /*Return the max of three double values*/
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
