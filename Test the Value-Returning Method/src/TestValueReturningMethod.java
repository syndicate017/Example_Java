public class TestValueReturningMethod {
    public static void main(String[] args) {
        /*Display results*/
        System.out.print("The first Grade is " + getGrade(78.5));
        System.out.print("\nThe second Grade is " + getGrade(59.5));

    }

    /*Create new method and rules*/
    public static char getGrade(double score) {
        if (score >= 90.0) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else return 'F';
    }

}
