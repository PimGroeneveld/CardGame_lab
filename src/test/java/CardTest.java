import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;
    Card card2;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.KING);
        card2 = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void kingHasValueOf10(){
        assertEquals(10, card.getValue());
    }

}