import java.util.*;


public class GuessBirthday {
    public static void main(String[] args) {
        /*Create a Calendar rules*/
        String set1 =
                " 1 3 5 7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        String set2 =
                " 2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                " 4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                " 8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        /*Day to be determined*/
        long day = 0;

        /*Create a Scanner method*/
        Scanner input = new Scanner(System.in);

        /*Prompt the user to answer the question 1*/
        System.out.print("Is your Birthday in Set Number 1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No, and 1 for Yes: ");

        long answer1 = input.nextLong();

        if (answer1 == 1) {
            day += 1;
        }


        /*Prompt the user to answer the question 2*/
        System.out.print("Is your BIrthday in Set Number 2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No, and 1 for Yes: ");

        long answer2 = input.nextLong();

        if (answer2 == 1) {
            day += 2;
        }


        /*Prompt the user to answer the question 3*/
        System.out.print("Is your Birthday in Set Number 3\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No, and 1 for Yes: ");

        long answer3 = input.nextLong();

        if (answer3 == 1) {
            day += 4;
        }


        /*Prompt the user to answer the question 4*/
        System.out.print("Is your Birthday in Set Number 4?\n");
        System.out.print(set4);
        System.out.print("\n Enter 0 for No, and 1 for Yes: ");

        long answer4 = input.nextLong();

        if (answer4 == 1) {
            day += 8;
        }


        /*Prompt the user to answer the question 5*/
        System.out.print("Isyour Birthday in Set Number 5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No, and 1 for Yes: ");

        long answer5 = input.nextLong();

        if (answer5 == 1) {
            day += 16;
        }


        /*Display results*/
        System.out.println("\nYour Birthday is " + day + "!");

    }
}
