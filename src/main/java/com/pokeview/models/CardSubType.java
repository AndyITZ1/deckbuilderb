package com.pokeview.models;

import jakarta.persistence.*;

@Entity
public class CardSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardSubTypeId;
    @Column(unique = true)
    private String subType;

    public CardSubType() {
    }

    public CardSubType(int cardSubTypeId, String subType) {
        this.cardSubTypeId = cardSubTypeId;
        this.subType = subType;
    }

    public CardSubType(String subType) {
        this.subType = subType;
    }

    public int getCardSubTypeId() {
        return cardSubTypeId;
    }

    public void setCardSubTypeId(int cardSubTypeId) {
        this.cardSubTypeId = cardSubTypeId;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardSubType that = (CardSubType) o;

        if (cardSubTypeId != that.cardSubTypeId) return false;
        return subType.equals(that.subType);
    }

    @Override
    public int hashCode() {
        int result = cardSubTypeId;
        result = 31 * result + subType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CardSubType{" +
                "cardSubTypeId=" + cardSubTypeId +
                ", subType='" + subType + '\'' +
                '}';
    }
}
