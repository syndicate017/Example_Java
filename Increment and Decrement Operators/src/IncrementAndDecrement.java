public class IncrementAndDecrement {
    public static void main(String[] args) {
        /*Increment and Decrement Operators - Postfix and Prefix example*/
        long i = 3, j = 3;
        i++; /*Postfix increment - It makes variable i becomes 4 after command*/
        j--; /*Postfix increment - It makes variable j becomes 2 after command*/

        /*Display results postfix*/
        System.out.println("variable i is " + i + " and variable j is " + j);

        long k = 5, l = 5;
        ++k; /*Prefix increment - It makes variable k becomes 6 before command*/
        --l; /*Prefix increment - It makes variable l becomes 4 before command*/

        /*Display results prefix*/
        System.out.println("variable k is " + k + " and variable l is " + l);

        /*Additional examples to illustrate the differences between prefix and postfix*/
        long A = 10;
        long newNumberA = 10 * A++;
        /*Display results postfix*/
        System.out.println("A is " + A + ", newNumber A is " + newNumberA);

        long B = 10;
        long newNumberB = 10 * (++B);
        /*Display results prefix*/
        System.out.println("B is " + B + ", newNumber B is " + newNumberB);
    }
}
