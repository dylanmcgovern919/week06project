package warGame;

public class App {

    public static void main(String[] args) {
        // 2a: Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        // 2a: Call the shuffle method on the deck
        deck.shuffle();

        // 2b: Using a traditional for loop, iterate 52 times 
        // Calling the Draw method to distribute the deck between players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                p1.draw(deck);
            } else {
                p2.draw(deck);
            }
        }

        // 2c: Using a traditional for loop, iterate 26 times
        for (int i = 0; i < 26; i++) {
            // 2c: Call the flip method for each player
            Card card1 = p1.flip();
            Card card2 = p2.flip();

            // 3a: Using the Card describe() logic (via getName) to illustrate gameplay
            System.out.print("Turn " + (i + 1) + ": " + card1.getName() + " vs " + card2.getName());

            // 2d: Compare the value of each card
            if (card1.getValue() > card2.getValue()) {
                // 2d: Call incrementScore on the player with the higher value
                p1.incrementScore();
                // 3b: Printing the winner of each turn
                System.out.println(" -> Player 1 wins the round!");
            } else if (card2.getValue() > card1.getValue()) {
                p2.incrementScore();
                System.out.println(" -> Player 2 wins the round!");
            } else {
                // Handle a tie (no points awarded)
                System.out.println(" -> It's a Tie!");
            }
        }

        // 2e & 3d: After the loop, compare the final score and print results
        System.out.println("\n--- FINAL SCORE ---");
        System.out.println(p1.getName() + ": " + p1.getScore());
        System.out.println(p2.getName() + ": " + p2.getScore());

        // 2f: Print the winner's name or "Draw"
        if (p1.getScore() > p2.getScore()) {
            System.out.println("WINNER: Player 1");
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println("WINNER: Player 2");
        } else {
            System.out.println("RESULT: Draw");
        }
    }
}
