import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player1;
    Player player2;
    Deck deck;
    Card cards;

    @Before
    public void before(){
        player1 = new Player("John");
        player2 = new Player("Pete");
    }

    @Test
    public void playersHaveName(){
        assertEquals("John", player1.getName());
    }

    @Test
    public void canTakeCard(){
        player1.takeCard();
        assertEquals(1, player1.getHand().size());
    }

}