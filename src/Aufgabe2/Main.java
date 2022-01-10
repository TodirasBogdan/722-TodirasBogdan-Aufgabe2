package Aufgabe2;

import controller.Controller;
import controller.ControllerInterface;
import model.Produkt;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produkt> produktList = new ArrayList<>();
        Controller controller = new Controller(produktList);
        View view = new View(controller);
        view.run();
    }
}
