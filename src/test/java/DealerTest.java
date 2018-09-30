import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Card card;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
        card = new Card(Suit.HEARTS, Rank.FIVE);
    }

    @Test
    public void dealerCanDeal(){
        Card card = dealer.deal(deck);
        assertNotNull(card);
        assertEquals(51, deck.numberOfCards());
    }

}
