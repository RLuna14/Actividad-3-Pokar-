public class Card {
    private String suit;
    private String color;
    private String value;

    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return suit + "," + color + "," + value;
    }
}
