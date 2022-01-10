package view;

import controller.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all products \r
                     2. Add a product \r
                     3. Remove a product \r
                     4. Update a product \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showAllProdukts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProdukt();
                    break;
                case 4:
                    updateProduct();
                    break;
            }

        }
    }

    private void showAllProdukts(){
        System.out.println(controller.getAll());
    }

    private void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Product attributes.");
        System.out.println("Enter Product id:");
        int id = scanner.nextInt();
        System.out.println("Enter Product name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter Product price:");
        int preis = scanner.nextInt();
        System.out.println("Enter Product sku:");
        String sku = scanner.nextLine();
        System.out.println("Enter initiale Anzahl Von Produkte");
        int initialeAnzahlVonProdukte = scanner.nextInt();


        controller.addProdukt(id, name, preis, sku, initialeAnzahlVonProdukte);
    }


    private void deleteProdukt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product id:");
        int id = scanner.nextInt();
        controller.deleteProdukt(id);
    }

    private void updateProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Product attributes.");
        System.out.println("Enter Product id:");
        int id = scanner.nextInt();
        System.out.println("Enter Product name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter Product price:");
        int preis = scanner.nextInt();
        System.out.println("Enter Product sku:");
        String sku = scanner.nextLine();
        System.out.println("Enter initiale Anzahl Von Produkte");
        int initialeAnzahlVonProdukte = scanner.nextInt();


        controller.updateProdukt(id, name, preis, sku, initialeAnzahlVonProdukte);
    }
}
