import java.util.*;


public class Hex2Dec {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to enter a string*/
        System.out.print("Enter a Hex Number: ");
        String hex = input.nextLine();

        /*Display results*/
        System.out.println("The Decimal value for Hex Number " +
                hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    /*Create a new hexToDecimal method*/
    public static int hexToDecimal(String hex) {
        /*Initialize the decimalValue value*/
        int decimalValue = 0;
        /*Create the rules*/
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    /*Create a new hexCharToDecimal method*/
    /*Create the rules*/
    /*A - F and 0 - 9 is the range of hexadecimals*/
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else return ch - '0';
    }
}
