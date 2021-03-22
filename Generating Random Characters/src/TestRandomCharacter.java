public class TestRandomCharacter {
    public static void main(String[] args) {
        /*Main method*/
        /*Initialize variable value*/
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        /*Print random lowercase characters between 'a' and 'z', 25 chars per line*/
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowercaseLetter();

            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else System.out.print(ch);

        }
    }

}
