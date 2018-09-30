import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Player player2;
    Card card;

    @Before
    public void before(){
        player = new Player("Player 1", false);
        player2 = new Player("Player 1", true);
        card = new Card(Suit.HEARTS, Rank.FIVE);
    }

    @Test
    public void hasName(){
        assertEquals("Player 1", player.getName());
    }

    @Test
    public void checkForDealer(){
        assertEquals(true, player2.checkIfDealer());
    }

    @Test
    public void canAddCard(){
        player.addCard(card);
        assertEquals(1, player.numberOfCards());
    }

    @Test
    public void canEmptyHand(){
        player.addCard(card);
        player.emptyHand();
        assertEquals(0, player.numberOfCards());
    }

    @Test
    public void hasHandValue(){
        player.addCard(card);
        assertEquals(5, player.getHandValue());
    }
}
