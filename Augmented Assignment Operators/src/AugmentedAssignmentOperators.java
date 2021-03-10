public class AugmentedAssignmentOperators {
    public static void main(String[] args) {
        /*Example of Augmented Assignment Operators*/
        long x = 123;
        x += 2; /*This statement is the same as x = x + 2*/
        System.out.println(x); /*Expression*/

        /*Example of Augmented Assignment Operators*/
        double a = 6.5;
        a += a + 1; /*This statement is the same as a = a + a + 1*/
        System.out.println(a); /*Expression*/
        a = 6;
        a /= 2; /*This statement is the same as a = a / 2*/
        System.out.println(a);
    }
}
