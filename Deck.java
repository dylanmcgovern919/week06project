package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // 1.b.i.1: Field for List of Card
    private List<Card> cards = new ArrayList<>();

    // 1.b.iii: Constructor - Populates the cards field with the standard 52 cards
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", 
                          "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        // Iterate through each suit and each name to create 52 unique cards
        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                // i + 2 assigns values 2-14 (Two through Ace)
                cards.add(new Card(i + 2, names[i] + " of " + suit));
            }
        }
    }

    // 1.b.ii.1: Method to randomize the order of the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // 1.b.ii.2: Method to remove and return the top card (index 0) of the Cards field
    public Card draw() {
        return cards.remove(0);
    }
}