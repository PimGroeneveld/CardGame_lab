import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private boolean isDealer;

    public Player(String name, boolean isDealer) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.isDealer = isDealer;
    }

    public String getName() {
        return name;
    }

    public boolean checkIfDealer() {
        if (this.isDealer = true) {
            return true;
        } else {
            return false;
        }
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int numberOfCards() {
        return this.hand.size();
    }

    public void emptyHand() {
        this.hand.clear();
    }

    public int getHandValue() {
        int total = 0;
        for (Card card : this.hand) {
            if (total <= 11) {
                total += card.getMaxValue();
            } else {
                total += card.getMinValue();
            }
        }
        return total;
    }
}
