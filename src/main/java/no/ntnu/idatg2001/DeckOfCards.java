package no.ntnu.idatg2001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * DeckOfCards class
 * @Author Niklas Leivestad
 * Version 15.04.2021
 */
class DeckOfCards {

    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private final PlayingCard[] deckOfCards = new PlayingCard[52];

    /**Constructor getting all 52 unique cards
     *
     */
    public DeckOfCards()
    {


        int index = 0;
        for (char c : suit)
        {
            for (int i = 1; i <= 13; i++) {
                deckOfCards[index] = new PlayingCard(c,i);
                index++;
            }
                //deck.add(new PlayingCard(face,suit));
        }

        //ArrayList<String> suits = PlayingCard.getSuit();
        // ArrayList<String> faceNames = PlayingCard.getValidFaceNames();
    }

    /**
     * ArrayList containing n number of cards, up to 52 unique ones.
     * @param n
     * @return handOfCards ArrayList
     * @throws IllegalArgumentException
     */
    public ArrayList<PlayingCard> dealHand(int n) throws IllegalArgumentException {
        if (n < 1 || n > 52) {
            throw new IllegalArgumentException("The number is from and including 1 to 52.");
        }
        Random random = new Random();
        ArrayList<PlayingCard> handOfCards = new ArrayList<>();
        PlayingCard card;
        for (int i = 0; i < n; i++){
            card = deckOfCards[random.nextInt(52)];
            if(handOfCards.contains(card)) {
                i--;
            } else {
                handOfCards.add(card);
            }
        }
        return handOfCards;

    }

    /** toString
     * @return
     */
    @Override
    public String toString() {
        return "DeckOfCards{" +
                ", deckOfCards=" + Arrays.toString(deckOfCards) +
                '}';
    }

    /**
     * getCard for testing
     * @param index
     * @return
     */
    public String getCard(int index) {
        return deckOfCards[index].getAsString();
    }
}
