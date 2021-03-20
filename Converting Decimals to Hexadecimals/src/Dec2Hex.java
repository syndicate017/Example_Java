import java.util.*;


public class Dec2Hex {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter a decimal number*/
        System.out.print("Enter a Decimal Number: ");
        long decimal = input.nextLong();

        /*Convert decimal to hex*/
        String hex = "";

        /*Create the rules*/
        while (decimal != 0) {
            long hexValue = decimal % 16;

            /*Convert a decimal value to a hex digit*/
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            /*Add to hex string*/
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }

        /*Display results*/
        System.out.println("The Hex Number is " + hex);
    }
}
