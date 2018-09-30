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
        // this test will now sometimes fail and sometimes pass since the dealer keeps picking cards will 16+ value, so can be 3 cards
        game.play();
        assertEquals(2, player1.numberOfCards());
        assertEquals(2, player2.numberOfCards());
        assertEquals(2, playerDealer.numberOfCards());
        assertEquals(46, deck.numberOfCards());
    }

    @Test
    public void highestWins(){
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

    @Test
    public void playerGoesBustIfOver21(){
        // getHandValue sets player hand value to 0 if over 21
        player1.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        player1.addCard(new Card(Suit.HEARTS, Rank.KING));
        player1.addCard(new Card(Suit.DIAMONDS, Rank.SIX));
        player2.addCard(new Card(Suit.HEARTS, Rank.FIVE));
        player2.addCard(new Card(Suit.SPADES, Rank.FOUR));
        player2.addCard(new Card(Suit.HEARTS, Rank.ACE));
        playerDealer.addCard(new Card(Suit.HEARTS, Rank.TEN));
        playerDealer.addCard(new Card(Suit.HEARTS, Rank.FIVE));
        playerDealer.addCard(new Card(Suit.HEARTS, Rank.TWO));
        assertEquals("Player 2", game.checkWinner());
    }

    @Test
    public void testGameChangingWinner(){
        // this one shows the constantly different outcomes of the game, so will only pass about 1/3 of the time
        game.play();
        assertEquals("Player 1", game.checkWinner());
    }

}
