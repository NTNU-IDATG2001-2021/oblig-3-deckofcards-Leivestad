package no.ntnu.idatg2001;

import java.util.ArrayList;

/**
 * HandOfCards class
 *
 * @Author Niklas Leivestad
 * Version 15.04.2021
 */
public class HandOfCards {

    private ArrayList<PlayingCard> hand;

    /**
     * Constructor for a hand of cards, new ArrayList
     */
    public  HandOfCards() {
        this.hand = new ArrayList<>(hand);
    }

    public HandOfCards(ArrayList<PlayingCard> hand) {
        this.hand = hand;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    public PlayingCard getCardAt(int index) {
        return hand.get(index);
    }

    public void addCard (PlayingCard newCard){

        hand.add(newCard);
    }

    public void addHand (ArrayList<PlayingCard> newHand){
        for (PlayingCard card : newHand){
            hand.add(card);
        }

    }

    /**
     * Clears the hand list
     */
    public void clearDeck () {
        hand.clear();
    }

    /**
     * @return Sums up cards on hand
     */
    public int sumOfCards() {
        return hand.stream().mapToInt(PlayingCard::getFace).sum();
    }

    /**
     * checks hand for S13
     * @return boolean
     */
    public boolean queenOfSpades(){
        if(hand.stream().anyMatch(playingCard -> playingCard.getSuit()== 'S' && playingCard.getFace() == 12)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "HandOfCards{" +
                "hand=" + hand +
                '}';
    }
}
