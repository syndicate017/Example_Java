public class CountLettersInArray {
    /*Main method*/
    public static void main(String[] args) {
        /*Declare and create an array*/
        char[] chars = createArray(); /*Create array*/

        /*Display the array*/
        System.out.println("The Random 100 Lowercase Letters are: ");
        displayArray(chars); /*Pass array*/

        /*Count the occurrences of each letter*/
        int[] counts = countLetters(chars); /*Return array*/

        /*Display counts*/
        System.out.println();
        System.out.println("The Occurrences of each letters are: ");
        displayCounts(counts);
    }

    /*Create a new createArray method*/
    /*Create an array of characters*/
    public static char[] createArray() {
        /*Declare an array of characters and create it*/
        char[] chars = new char[100];

        /*Create lowercase letters randomly and assign them to the array*/
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowercaseLetter();
        }

        /*Return the array*/
        return chars;
    }

    /*Display the array of characters*/
    public static void displayArray(char[] chars) {
        /*Display the characters in the array 20 on each line*/
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else System.out.print(chars[i] + " ");
        }
    }

    /*Count the occurrences of each letter*/
    public static int[] countLetters(char[] chars) {
        /*Declare and create an array of 26 int*/
        int[] counts = new int[26];

        /*For each lowercase letter in the array, count it*/
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }

        /*Return the count*/
        return counts;
    }

    /*Display counts*/
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println((char) (i + 'a') + "=" + counts[i] + " ");
            }
            else System.out.print((char) (i + 'a') + "=" + counts[i] + " ");
        }
    }
}
