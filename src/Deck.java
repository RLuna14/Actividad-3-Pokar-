import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colors = {"Negro", "Rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            String color = (suit.equals("Corazones") || suit.equals("Diamantes")) ? colors[1] : colors[0];
            for (String value : values) {
                cards.add(new Card(suit, color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            Random random = new Random();
            Card card = cards.remove(random.nextInt(cards.size()));
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void hand() {
        if (cards.size() >= 5) {
            Card[] hand = new Card[5];
            for (int i = 0; i < 5; i++) {
                hand[i] = cards.remove(0);
                System.out.println(hand[i]);
            }
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No hay suficientes cartas en el deck para una mano.");
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}
