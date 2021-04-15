package no.ntnu.idatg2001;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * CardGameController class
 * This is where the fxml.file communicates to the java.files
 *
 * @Author Niklas Leivestad
 * Version 15.04.2021
 */
public class CardGameController {
    private final DeckOfCards deck = new DeckOfCards();
    private HandOfCards hand;
    int n = 5;

    @FXML
    public Button dealHandButton;
    @FXML
    public Label displayCards;
    @FXML
    public Button checkHandButton;
    @FXML
    public Label flush;
    @FXML
    public Label queenOfSpades;
    @FXML
    public Label sumOfFaces;
    @FXML
    public Label cardsOfHearts;

    /**
     * dealHand button method.
     * Starting clearing out, adding hand
     * and displaying in text format
     */
    public void dealHand() {
        hand.clearDeck();
        hand.addHand(deck.dealHand(n));
        displayCards.setText(hand.toString());

        //displayCards();
    }



    /*public void dealFive() {
        this.hand = new HandOfCards(deck.dealHand(5));
        System.out.println("5 cards dealt");
    }

     */

    /**
     *
     */
    public void displayCards(){
        displayCards.setText(hand.toString());
    }


    /**
     * Method for cheking hand button
     * Checks your hand of several things
     *  the sum, queen of spades, flush and number of heart cards.
     *
     */
    public void checkHand() {

        sumOfFaces.setText(String.valueOf(hand.sumOfCards()));

        if(hand.queenOfSpades()){
            queenOfSpades.setText("Yes");
        } else {
            queenOfSpades.setText("no");
        }
    }
}
