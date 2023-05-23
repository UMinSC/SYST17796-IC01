package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author UMin May 23, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random() * 13 + 1));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            hand[i] = card;
            //System.out.println(i + hand[i].getSuit() + hand[i].getValue());
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Pick a card (enter a value from 1 to 13).\n 1 for Ace, 11 for Jack, 12 for Queen, 13 for King:");
        Card anyCard = new Card();
        anyCard.setValue(input.nextInt());
        System.out.print("Enter the suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        anyCard.setSuit(Card.SUITS[input.nextInt() - 1]);
        
        // and search the hand here. 
        for (int i = 0; i < hand.length; i++) {
            if(anyCard.getValue() == hand[i].getValue() && anyCard.getSuit().equals(hand[i].getSuit()))
                printInfo();
        }
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author UMin May 23, 2023
     * I’m done!
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Minmin, but you can call me UMin");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
	System.out.println("-- Have a semester with no violations of academic integrity and be more active on LinkedIn");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing Games");
	System.out.println("-- Archery");
        System.out.println("-- Watching TV");
        System.out.println("-- Travelling");

        System.out.println();
        
    
    }

}
