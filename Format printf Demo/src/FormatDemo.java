import java.util.*;


public class FormatDemo {
    public static void main(String[] args) {
        /*Display the header of the table*/
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Degrees", "Radians",
                "Sine", "Cosine", "Tangent");

        /*Display values for 30 degrees*/
        long degrees30 = 30;
        double radians30 = Math.toRadians(degrees30);
        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f\n", degrees30,
                radians30, Math.sin(radians30), Math.cos(radians30), Math.tan(radians30));

        /*Display values for 60 degrees*/
        long degrees60 = 60;
        double radians60 = Math.toRadians(degrees60);
        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f\n", degrees60,
                radians60, Math.sin(radians60), Math.cos(radians60), Math.tan(radians60));

    }
}
