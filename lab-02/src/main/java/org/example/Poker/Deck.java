package org.example.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deck {
    public Deck() {}
    public List<Card> fabryki(){
        List<Card> cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        // Sortowanie kart według koloru, a następnie wartości
        cards.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank));

        return cards;
    }

    public List<Card> shuffle(List<Card> sortedCards){
        List<Card> shuffledCards = new ArrayList<>(sortedCards);
        Collections.shuffle(shuffledCards);
        return shuffledCards;
    }
}
