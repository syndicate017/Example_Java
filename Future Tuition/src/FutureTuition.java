public class FutureTuition {
    public static void main(String[] args) {
        /*Initialize variable*/
        double tuition = 10000;
        long year = 0;

        /*Create the rules*/
        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }

        /*Display results*/
        System.out.println("Tuition will be doubled in " +
                year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years",
                tuition, year);
    }
}
