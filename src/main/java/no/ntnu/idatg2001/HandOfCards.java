package no.ntnu.idatg2001;

import java.util.ArrayList;

public class HandOfCards {

    private ArrayList<PlayingCard> hand;

    public HandOfCards(ArrayList<PlayingCard> hand) {
        this.hand = hand;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    public PlayingCard getCardAt(int index) {
        return hand.get(index);
    }

    public void clearDeck (){
        hand.clear();
    }

    @Override
    public String toString() {
        return "HandOfCards{" +
                "hand=" + hand +
                '}';
    }
}
