package no.ntnu.idatg2001;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class DeckOfCardsTest extends TestCase {

    DeckOfCards deck = new DeckOfCards();
    private final PlayingCard[] deckOfCards = new PlayingCard[52];

    @Test
    @DisplayName("Creating a deck of cards")
    public void TestCreatingDeck() {
        Assertions.assertEquals(52, deckOfCards.length);
    }

}