package org.example.Poker;

public class Card {

    protected Suit suit;
    protected Rank rank;

    public Card (Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card c1 = (Card) o;

        if (!getSuit().equals(c1.getSuit())) return false;
        return getRank().equals(c1.getRank());
    }

    @Override
    public int hashCode() {
        int result = getSuit().hashCode();
        result = 31 * result + getRank().hashCode();
        return result;
    }
}
