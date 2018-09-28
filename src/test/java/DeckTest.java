import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckIsPopulated(){
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canShuffleCards(){
        deck.shuffleCards();
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canDealCard(){
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(51, deck.numberOfCards());
    }

}