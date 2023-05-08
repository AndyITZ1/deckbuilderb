package com.pokeview.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deckId;
    private String deckName;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "deck_cards",
            joinColumns = @JoinColumn(name = "deck_id", referencedColumnName = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id", referencedColumnName = "card_id"))
    private List<Card> deckCards;

    public Deck() {

    }

    public Deck(int deckId, String deckName, List<Card> deckCards) {
        this.deckId = deckId;
        this.deckName = deckName;
        this.deckCards = deckCards;
    }

    public Deck(String deckName, List<Card> deckCards) {
        this.deckName = deckName;
        this.deckCards = deckCards;
    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deckId) {
        this.deckId = deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public List<Card> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(List<Card> deckCards) {
        this.deckCards = deckCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deck deck = (Deck) o;

        if (deckId != deck.deckId) return false;
        if (deckName != null ? !deckName.equals(deck.deckName) : deck.deckName != null) return false;
        return deckCards != null ? deckCards.equals(deck.deckCards) : deck.deckCards == null;
    }

    @Override
    public int hashCode() {
        int result = deckId;
        result = 31 * result + (deckName != null ? deckName.hashCode() : 0);
        result = 31 * result + (deckCards != null ? deckCards.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckId=" + deckId +
                ", deckName='" + deckName + '\'' +
                ", deckCards=" + deckCards +
                '}';
    }
}
