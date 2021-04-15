package no.ntnu.idatg2001;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class DeckOfCards {

    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private final PlayingCard[] deckOfCards = new PlayingCard[52];


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
}
