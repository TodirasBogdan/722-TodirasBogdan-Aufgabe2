package controller;

import model.Produkt;

import java.util.List;
import java.util.Objects;

public class Controller implements ControllerInterface {

    private List<Produkt> produktList;

    public Controller(List<Produkt> produktList) {
        this.produktList = produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }



    @Override
    public Produkt addProdukt(Integer id, String name, Integer preis, String sku, Integer initialeAnzahlVonProdukte) {
        Produkt produkt = new Produkt(id, name, preis, sku, initialeAnzahlVonProdukte);
        produktList.add(produkt);
        return produkt;
    }


    @Override
    public List<Produkt> getAll() {
        return produktList;
    }


    @Override
    public Produkt findById(Integer id) {
        for (Produkt produkt : produktList) {
            if (Objects.equals(produkt.getId(), id)) {
                return produkt;
            }
        }
        return null;
    }


    @Override
    public void updateProdukt(Integer id, String name, Integer preis, String sku, Integer initialeAnzahlVonProdukte) {
        for (Produkt produkt : produktList) {
            if (Objects.equals(produkt.getId(), id)) {
                produkt.setName(name);
                produkt.setPreis(preis);
                produkt.setSku(sku);
                produkt.setInitialeAnzahlVonProdukte(initialeAnzahlVonProdukte);
            }
        }
    }

    @Override
    public void deleteProdukt(Integer id) {
        produktList.removeIf(produkt -> Objects.equals(produkt.getId(), id));
    }
}
