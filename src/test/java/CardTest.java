import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void getSuit() {
    }

    @Test
    public void getRank() {
    }

}