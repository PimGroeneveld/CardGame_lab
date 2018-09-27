import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

//    public void takeCard() {
//        deck.populateDeck();
//        Card card = deck.dealCard();
//        hand.add(card);
//    }
}
