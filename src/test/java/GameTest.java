import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GameTest {

    Game game;
    Dealer dealer;
    Player player1;
    Player player2;
    Player playerDealer;
    Deck deck;

    @Before()
    public void before(){
        deck = new Deck();
        dealer = new Dealer();
        player1 = new Player("Player 1", false);
        player2 = new Player("Player 2", false);
        playerDealer = new Player("Dealer", true);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(playerDealer);
        game = new Game(deck, dealer, players);
    }

    @Test
    public void canPlay(){
        game.play();
        assertEquals(2, player1.numberOfCards());
        assertEquals(2, player2.numberOfCards());
        assertEquals(2, playerDealer.numberOfCards());
        assertEquals(46, deck.numberOfCards());
    }

    @Test
    public void dealerWins(){
        player1.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        player2.addCard(new Card(Suit.HEARTS, Rank.FIVE));
        playerDealer.addCard(new Card(Suit.HEARTS, Rank.TEN));
        assertEquals("Dealer", game.checkWinner());
    }

    @Test
    public void drawReturnsNull(){
        player1.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        player2.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        playerDealer.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        assertNull(game.checkWinner());
    }


}
