import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int round = 1;
        int max = 51;
        int min;
        int plWins = 0;
        int cpuWins = 0;

        Random rand = new Random();
        arrDeck printDeck = new arrDeck();
        printDeck.popDeck();

        int plChoice;
        int cpuChoice;

        System.out.println("Game of Cut");

        while(plWins < 3 & cpuWins <3) {
            printDeck.shuffledDeck();
            System.out.println("Pick a card: ");
            plChoice = scan.nextInt() -1;
            min = plChoice +1;
            System.out.println(printDeck.selectCard(plChoice));
            printDeck.removeCard(plChoice);

            cpuChoice = (rand.nextInt(max + 1 - min) + min);
            System.out.println(printDeck.selectCard(cpuChoice));

            if (printDeck.selectCard(plChoice).getFace() == printDeck.selectCard(cpuChoice).getFace()) {
                if ((printDeck.selectCard(plChoice).getSuit()) > (printDeck.selectCard(cpuChoice).getSuit())){
                    plWins ++;
                    System.out.println("Player wins this round");
                }
                if ((printDeck.selectCard(plChoice).getSuit()) < (printDeck.selectCard(cpuChoice).getSuit())){
                    cpuWins ++;
                    System.out.println("CPU wins this round");
                }
            }
            if (printDeck.selectCard(plChoice).getFace() > printDeck.selectCard(cpuChoice).getFace()) {
                plWins ++;
                System.out.println("player wins this round");
            }
            if (printDeck.selectCard(plChoice).getFace() < printDeck.selectCard(cpuChoice).getFace()) {
                cpuWins ++;
                System.out.println("cpu wins this round");
            }
        }
        if(plWins > cpuWins){
            System.out.println("Player won!");
        }
        else{
            System.out.println("Player lost!");
        }
    }
}