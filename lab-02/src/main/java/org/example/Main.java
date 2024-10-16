package org.example;

import org.example.Dog.Dog;
import org.example.Poker.Card;
import org.example.Poker.Deck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Y y = new Y();
//        Dog d1 = new Dog("rex", "Ruff!");
//        Dog d2 = new Dog("scruffy", "Wurf!");
//        Dog d3;
//        d3 = d1;
//        Dog d4 = new Dog("rex", "Ruff!");
//        System.out.println(d1.getName() + " - " + d1.getSays());
//        System.out.println(d2.getName() + " - " + d2.getSays());
//        System.out.println(d3.getName() + " - " + d3.getSays());
//        if(d4.equals(d1)){
//            System.out.println("equals");
//        }
        Deck deck = new Deck();
        List<Card> myCards = deck.fabryki();
        List<Card> shuffled = deck.shuffle(myCards);
        HashMap<String, List<Card>> playersCards = new HashMap<>();
        String[] players = {"Janek", "Marek", "Zuzia", "Piotrek"};

        for (String player : players) {
            List<Card> temp = new ArrayList<>();
            for(int i = 0; i < 5; ++i){
                temp.add(shuffled.getFirst());
                shuffled.removeFirst();
            }
            playersCards.put(player, temp);
        }

        for(String player : playersCards.keySet()){
            System.out.println("======================");
            System.out.println(player + ": ");
            for(Card card : playersCards.get(player)){
                System.out.println(card.getRank() + " " + card.getSuit());
            }
        }
    }

}