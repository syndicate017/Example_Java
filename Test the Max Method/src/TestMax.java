public class TestMax {
    public static void main(String[] args) {
        /*Main method*/
        /*Declaring variables*/
        /*Use a new mehod before its mehod was created before*/
        long i = 5;
        long j = 2;
        long k = max(i, j);

        /*Display results*/
        System.out.println("The Maximum value between " +
                i + " and " + j + " is " + k);

    }

    /*Create a new method which it used before*/
    /*Return the max of two numbers*/
    public static long max(long num1, long num2) {
        /*Create the variable which used for placing the results of this method*/
        long result;

        /*Create the rules*/
        if (num1 > num2) {
            result = num1;
        } else result = num2;

        /*Bring back the results of this method to the "result" variable*/
        return result;
    }

}
