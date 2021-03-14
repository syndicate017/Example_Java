public class EqualityTest {
    public static void main(String[] args) {
        /*Create fixed value using "final" method*/
        /*if fixed value is using "double" variable, EPSILON use 1E-14*/
        /*if fixed value is using "float" variable, EPSILON use 1E-7*/
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;

        /*Create rules formula*/
        if (Math.abs(x - 0.5) < EPSILON) {
            System.out.println(x + " is approximately 0.5");
        }
    }
}
