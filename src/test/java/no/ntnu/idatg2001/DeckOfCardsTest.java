package no.ntnu.idatg2001;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

public class DeckOfCardsTest extends TestCase {

    DeckOfCards deck = new DeckOfCards();
    private final PlayingCard[] deckOfCards = new PlayingCard[52];

    @Test
    @DisplayName("Creating a deck of cards")
    public void TestCreatingDeck() {
        Assertions.assertEquals(52, deckOfCards.length);
    }

    @org.junit.jupiter.api.Test
    void dealHoldEm() {
        DeckOfCards deckOfCards = new DeckOfCards();
        ArrayList<PlayingCard> handOfCards = deckOfCards.dealHand(2);

        Assertions.assertEquals(2, handOfCards.size());
    }

    @Test
    @DisplayName("Ace of spades")
    public void aceOfSpades() {
        assertEquals("S1", deck.getCard(0));
    }
}