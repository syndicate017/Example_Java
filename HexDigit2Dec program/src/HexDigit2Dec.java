import java.util.*;


public class HexDigit2Dec {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter the digit*/
        System.out.print("Enter a Hex Digit: ");
        String hexString = input.nextLine();

        /*Check if the hex string has exactly one character*/
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        /*Display decimal value for the hex digit*/
        char ch = Character.toUpperCase(hexString.charAt(0));

        if ('A' <= ch && ch <= 'F') {
            long value = ch - 'A' + 10;
            System.out.println("The decimal value for Hex Digit " + ch + " is " + value);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for Hex Digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
