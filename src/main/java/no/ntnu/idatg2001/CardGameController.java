package no.ntnu.idatg2001;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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

    public void dealHand() {
        hand.clearDeck();
        hand.addHand(deck.dealHand(n));
        displayCards.setText(hand.toString());

        displayCards();
    }



    /*public void dealFive() {
        this.hand = new HandOfCards(deck.dealHand(5));
        System.out.println("5 cards dealt");
    }

     */

    public void displayCards(){
        displayCards.setText(hand.toString());
    }


    public void checkHand(MouseEvent mouseEvent) {
    }
}
