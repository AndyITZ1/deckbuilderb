package com.pokeview.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CardLegal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int legalId;
    private String unlimited;
    private String standard;
    private String expanded;

    public CardLegal() {
    }

    public CardLegal(int legalId, String unlimited, String standard, String expanded) {
        this.legalId = legalId;
        this.unlimited = unlimited;
        this.standard = standard;
        this.expanded = expanded;
    }

    public CardLegal(String unlimited, String standard, String expanded) {
        this.unlimited = unlimited;
        this.standard = standard;
        this.expanded = expanded;
    }

    public int getLegalId() {
        return legalId;
    }

    public void setLegalId(int legalId) {
        this.legalId = legalId;
    }

    public String getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardLegal cardLegal = (CardLegal) o;

        if (legalId != cardLegal.legalId) return false;
        if (unlimited != null ? !unlimited.equals(cardLegal.unlimited) : cardLegal.unlimited != null) return false;
        if (standard != null ? !standard.equals(cardLegal.standard) : cardLegal.standard != null) return false;
        return expanded != null ? expanded.equals(cardLegal.expanded) : cardLegal.expanded == null;
    }

    @Override
    public int hashCode() {
        int result = legalId;
        result = 31 * result + (unlimited != null ? unlimited.hashCode() : 0);
        result = 31 * result + (standard != null ? standard.hashCode() : 0);
        result = 31 * result + (expanded != null ? expanded.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CardLegal{" +
                "legalId=" + legalId +
                ", unlimited='" + unlimited + '\'' +
                ", standard='" + standard + '\'' +
                ", expanded='" + expanded + '\'' +
                '}';
    }
}
