public class card {

    private final String[] suits = {null, "♠", "♥" , "♣", " ♦"};
    private final String [] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"} ;
    private final int face;
    private final int suit;

    public card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return faces[face] + "of" + suits[suit];
    }



}