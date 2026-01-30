package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // 1.c.i.1: Field for hand (List of Card)
    private List<Card> hand = new ArrayList<>();
    
    // 1.c.i.2: Field for score (set to 0 in the constructor)
    private int score;
    
    // 1.c.i.3: Field for name
    private String name;

    public Player(String name) {
        this.name = name;
        // 1.c.i.2: score set to 0 in the constructor
        this.score = 0;
    }

    // 1.c.ii.1: describe method - prints player info and calls describe() for each card in hand
    public void describe() {
        System.out.println("Player: " + name + " | Score: " + score);
        for (Card card : hand) {
            card.describe();
        }
    }

    // 1.c.ii.2: flip method - removes and returns the top card of the Hand
    public Card flip() {
        return hand.remove(0);
    }

    // 1.c.ii.3: draw method - takes a Deck, calls draw on it, and adds returned Card to hand
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // 1.c.ii.4: incrementScore method - adds 1 to the Player’s score field
    public void incrementScore() {
        score++;
    }

    // Getters for score and name (used in App class for final comparison)
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}