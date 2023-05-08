package com.pokeview.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Card {
    @Id
    private String cardId;
    private String cardName;
    private String cardSuperType;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "card_subtypes",
            joinColumns = @JoinColumn(name = "card_id", referencedColumnName = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "subtype_id", referencedColumnName = "card_sub_type_id"))
    private Set<CardSubType> cardSubTypes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "set_id")
    private CardSet cardSet;
    private String cardRarity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = )
    private CardLegal legalities;
    private String smallImage;
    private String largeImage;
    private String tcgplayerUrl;
    private String cardMarketPrice;

    public Card() {
    }

    public Card(String cardId, String cardName, String cardSuperType, Set<CardSubType> cardSubTypes, CardSet cardSet, String cardRarity, CardLegal legalities, String smallImage, String largeImage, String tcgplayerUrl, String cardMarketPrice) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardSuperType = cardSuperType;
        this.cardSubTypes = cardSubTypes;
        this.cardSet = cardSet;
        this.cardRarity = cardRarity;
        this.legalities = legalities;
        this.smallImage = smallImage;
        this.largeImage = largeImage;
        this.tcgplayerUrl = tcgplayerUrl;
        this.cardMarketPrice = cardMarketPrice;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardSuperType() {
        return cardSuperType;
    }

    public void setCardSuperType(String cardSuperType) {
        this.cardSuperType = cardSuperType;
    }

    public Set<CardSubType> getCardSubTypes() {
        return cardSubTypes;
    }

    public void setCardSubTypes(Set<CardSubType> cardSubTypes) {
        this.cardSubTypes = cardSubTypes;
    }

    public CardSet getCardSet() {
        return cardSet;
    }

    public void setCardSet(CardSet cardSet) {
        this.cardSet = cardSet;
    }

    public String getCardRarity() {
        return cardRarity;
    }

    public void setCardRarity(String cardRarity) {
        this.cardRarity = cardRarity;
    }

    public CardLegal getLegalities() {
        return legalities;
    }

    public void setLegalities(CardLegal legalities) {
        this.legalities = legalities;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getTcgplayerUrl() {
        return tcgplayerUrl;
    }

    public void setTcgplayerUrl(String tcgplayerUrl) {
        this.tcgplayerUrl = tcgplayerUrl;
    }

    public String getCardMarketPrice() {
        return cardMarketPrice;
    }

    public void setCardMarketPrice(String cardMarketPrice) {
        this.cardMarketPrice = cardMarketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!cardId.equals(card.cardId)) return false;
        if (!cardName.equals(card.cardName)) return false;
        if (cardSuperType != null ? !cardSuperType.equals(card.cardSuperType) : card.cardSuperType != null)
            return false;
        if (cardSubTypes != null ? !cardSubTypes.equals(card.cardSubTypes) : card.cardSubTypes != null) return false;
        if (cardSet != null ? !cardSet.equals(card.cardSet) : card.cardSet != null) return false;
        if (cardRarity != null ? !cardRarity.equals(card.cardRarity) : card.cardRarity != null) return false;
        if (legalities != null ? !legalities.equals(card.legalities) : card.legalities != null) return false;
        if (smallImage != null ? !smallImage.equals(card.smallImage) : card.smallImage != null) return false;
        if (largeImage != null ? !largeImage.equals(card.largeImage) : card.largeImage != null) return false;
        if (tcgplayerUrl != null ? !tcgplayerUrl.equals(card.tcgplayerUrl) : card.tcgplayerUrl != null) return false;
        return cardMarketPrice != null ? cardMarketPrice.equals(card.cardMarketPrice) : card.cardMarketPrice == null;
    }

    @Override
    public int hashCode() {
        int result = cardId.hashCode();
        result = 31 * result + cardName.hashCode();
        result = 31 * result + (cardSuperType != null ? cardSuperType.hashCode() : 0);
        result = 31 * result + (cardSubTypes != null ? cardSubTypes.hashCode() : 0);
        result = 31 * result + (cardSet != null ? cardSet.hashCode() : 0);
        result = 31 * result + (cardRarity != null ? cardRarity.hashCode() : 0);
        result = 31 * result + (legalities != null ? legalities.hashCode() : 0);
        result = 31 * result + (smallImage != null ? smallImage.hashCode() : 0);
        result = 31 * result + (largeImage != null ? largeImage.hashCode() : 0);
        result = 31 * result + (tcgplayerUrl != null ? tcgplayerUrl.hashCode() : 0);
        result = 31 * result + (cardMarketPrice != null ? cardMarketPrice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId='" + cardId + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cardSuperType='" + cardSuperType + '\'' +
                ", cardSubTypes=" + cardSubTypes +
                ", cardSet=" + cardSet +
                ", cardRarity='" + cardRarity + '\'' +
                ", legalities=" + legalities +
                ", smallImage='" + smallImage + '\'' +
                ", largeImage='" + largeImage + '\'' +
                ", tcgplayerUrl='" + tcgplayerUrl + '\'' +
                ", cardMarketPrice='" + cardMarketPrice + '\'' +
                '}';
    }
}
