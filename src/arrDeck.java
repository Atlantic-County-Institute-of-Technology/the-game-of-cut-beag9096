import java.util.*;

public class arrDeck {
    Random shuffles = new Random();
    card[] deck = new card[52];

    public void popDeck() {
        int i = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[i] = (new card(face, suit));
                i++;
            }
        }
    }

    public void shuffledDeck() {
        for (int i = 0; i < deck.length; i++) {
            int newPos = shuffles.nextInt(52);
            card temp = deck[i];
            deck[i] = deck[newPos];
            deck[newPos] = temp;
        }
    }

    public String toString() {
        String strDeck = "";
        for (int i=0; i < deck.length; i++) {
            strDeck = strDeck + deck[i].toString() + "\n";
        }
        return strDeck;
    }

    public card selectCard(int index) {

    }

}





























//    public card selectCard(int target) {
//        return deck[target];
//    }
//
//    public int getDeckSize() {
//        return deckSize;
//    }