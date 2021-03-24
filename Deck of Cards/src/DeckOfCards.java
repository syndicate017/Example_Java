public class DeckOfCards {
    public static void main(String[] args) {
        /*Create the variable and initialize the value*/
        int[] deck = new int[52]; /*Create array deck*/
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; /*Array of strings*/
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};

        /*Initialize the cards*/
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        /*Shuffle the cards*/
        for (int i = 0; i < deck.length; i++) {
            /*generate an index randomly*/
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        /*Display the first four cards*/
        System.out.println("Your Cards Collection is: \n");
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13]; /*Suit of a card*/
            String rank = ranks[deck[i] % 13]; /*Rank of a card*/
            /*Display results*/
            System.out.println("Card Number " + deck[i] + ": " +
                    rank + " of " + suit);
        }
    }
}
