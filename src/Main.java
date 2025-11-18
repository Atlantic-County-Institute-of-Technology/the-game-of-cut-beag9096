import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a card: ");
        int p1pick = scan.nextInt();

        arrDeck printDeck = new arrDeck();
        printDeck.popDeck();
        printDeck.shuffledDeck();


        arrDeck pick1 = new arrDeck();
        pick1.selectCard();

        System.out.println(pick1);





    }
}