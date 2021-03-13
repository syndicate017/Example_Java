import java.util.*;


public class LetterGrade {
    public static void main(String[] args) {
        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to input*/
        System.out.print("Enter the score number: ");
        float score = input.nextFloat();

        /*Create the Letter Grade rules*/
        if (score >= 90) {
            System.out.println("You've got A grade");
        } else if (score >= 80) {
            System.out.println("You've got B grade");
        } else if (score >= 70) {
            System.out.println("You've got C grade");
        } else if (score >= 60) {
            System.out.println("You've got D grade");
        }
        else System.out.println("You've got F grade");
    }
}
