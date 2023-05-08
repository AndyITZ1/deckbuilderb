package com.pokeview.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CardSet {
    @Id
    private String setId;
    @Column(unique = true)
    private String name;
    private String series;
    private String symbol;
    private String logo;

    public CardSet() {

    }

    public CardSet(String setId, String name, String series, String symbol, String logo) {
        this.setId = setId;
        this.name = name;
        this.series = series;
        this.symbol = symbol;
        this.logo = logo;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardSet cardSet = (CardSet) o;

        if (!setId.equals(cardSet.setId)) return false;
        if (!name.equals(cardSet.name)) return false;
        if (!series.equals(cardSet.series)) return false;
        if (!symbol.equals(cardSet.symbol)) return false;
        return logo.equals(cardSet.logo);
    }

    @Override
    public int hashCode() {
        int result = setId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + series.hashCode();
        result = 31 * result + symbol.hashCode();
        result = 31 * result + logo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CardSet{" +
                "setId='" + setId + '\'' +
                ", name='" + name + '\'' +
                ", series='" + series + '\'' +
                ", symbol='" + symbol + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
