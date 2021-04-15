package no.ntnu.idatg2001;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CardGameController {
    private final DeckOfCards deck = new DeckOfCards();
    private HandOfCards hand;

    @FXML
    public Button dealHandButton;
    @FXML
    public Label dealHandText;
    @FXML
    public Button checkHandButton;
    @FXML
    public Label flushText;
    @FXML
    public Label queenOfSpades;
    @FXML
    public Label sumOfFaces;
    @FXML
    public Label cardsOfHearth;

    public void dealHand() {
        hand.clearDeck();
        dealFive();
        dealHandText.setText(hand.toString());

        displayCards();
    }

    public void dealFive() {
        this.hand = new HandOfCards(deck.dealHand(5));
        System.out.println("5 cards dealt");
    }

    public void displayCards(){
        dealHandText.setText(hand.toString());
    }



}
