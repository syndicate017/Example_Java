public class VarArgsDemo {
    public static void main(String[] args) {
        /*Initialize the variable value*/
        printMax(34, 3, 3, 2, 56.5); /*pass variable-length argument list*/
        printMax(new double[]{1, 2, 3}); /*pass an array argument*/
    }

    public static void printMax(double... numbers) { /*a variable-length argument parameter*/
        if (numbers.length == 0) {
            System.out.println("No argument passed!");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }

        /*Display results*/
        System.out.println("The Max value is: " + result);
    }
}
