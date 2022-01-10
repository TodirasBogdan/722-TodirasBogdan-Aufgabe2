package model;

import java.util.Objects;

public class Produkt {

    private Integer id;
    private String name;
    private Integer preis;
    private String sku;
    private Integer initialeAnzahlVonProdukte;

    public Produkt(Integer id, String name, Integer preis, String sku, Integer initialeAnzahlVonProdukte) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.sku = sku;
        this.initialeAnzahlVonProdukte = initialeAnzahlVonProdukte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPreis() {
        return preis;
    }

    public void setPreis(Integer preis) {
        this.preis = preis;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getInitialeAnzahlVonProdukte() {
        return initialeAnzahlVonProdukte;
    }

    public void setInitialeAnzahlVonProdukte(Integer initialeAnzahlVonProdukte) {
        this.initialeAnzahlVonProdukte = initialeAnzahlVonProdukte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produkt produkt)) return false;
        return Objects.equals(getId(), produkt.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis='" + preis + '\'' +
                ", sku='" + sku + '\'' +
                ", initialeAnzahlVonProdukte=" + initialeAnzahlVonProdukte +
                '}';
    }
}
