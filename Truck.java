/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Truck extends Vehicle {

    private boolean loadingBed;
    private static ArrayList<Truck> inventory = new ArrayList();

    public Truck(String regNo, String color, String make, String model, int seats, double price, String engineType, double mileage, boolean loadingBed) {
        super(regNo, color, make, model, seats, price, engineType, mileage);
        this.loadingBed = loadingBed;
    }

    public boolean isLoadingBed() {
        return loadingBed;
    }

    public void setLoadingBed(boolean loadingBed) {
        this.loadingBed = loadingBed;
    }

    public static ArrayList getInventory() {
        return inventory;
    }

    public static int stockTaken() {
        return inventory.size();
    }

    public static void addToInventory(Truck truck) {
        inventory.add(truck);
    }

    @Override
    public void info() {
        System.out.println("Truck Details: ");
        System.out.println("Registration No: " + this.getRegNo());
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("Has LoadingBed?: " + this.isLoadingBed());
        System.out.println("Price: " + this.getPrice());
        System.out.println();
    }
}
