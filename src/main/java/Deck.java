import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        populateDeck();
        shuffleCards();

    }

    public int numberOfCards(){
        return this.cards.size();
    }

    private void populateDeck(){  //private to prevent external files from accidental double populate
        for(Suit suit : Suit.values()){  // for every suit, go through all the values (heart/diamond etc)
            for(Rank rank : Rank.values()){ // then go through these suits and add every rank
                cards.add(new Card(suit, rank)); // resulting in all the possible suits with all the possible values
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
