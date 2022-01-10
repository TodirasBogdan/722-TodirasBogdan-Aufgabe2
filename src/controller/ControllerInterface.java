package controller;

import model.Produkt;

import java.util.List;

public interface ControllerInterface {

    /**
     * add ein Produkt
     */
    Produkt addProdukt(Integer id, String name, Integer preis, String sku, Integer initialeAnzahlVonProdukte);

    /**
     * gibt alle Produkte
     */
    List<Produkt> getAll();

    /**
     * findet ein Produkt
     */
    Produkt findById(Integer id);

    /**
     * modifiziert ein Produkt
     */
    void updateProdukt(Integer id, String name, Integer preis, String sku, Integer initialeAnzahlVonProdukte);

    /**
     * loescht ein Produkt
     */
    void deleteProdukt(Integer id);
}
