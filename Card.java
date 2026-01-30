package warGame;

public class Card {
    // 1.a.i.1: Field for value (2-14 representing cards 2-Ace)
    private int value;
    
    // 1.a.i.2: Field for name (e.g., Ace of Diamonds)
    private String name;

    // Constructor to initialize the fields
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // 1.a.ii.1: Getters and Setters
    public int getValue() { 
        return value; 
    }
    
    public void setValue(int value) { 
        this.value = value; 
    }
    
    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    // 1.a.ii.2: describe method - prints out information about a card
    public void describe() {
        System.out.println(name);
    }
}

