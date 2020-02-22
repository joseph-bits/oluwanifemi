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
public abstract class Vehicle {

    private String regNo;
    private String color;
    private String make;
    private String model;
    private int seats;
    private double price;
    private String engineType;
    private double mileage;
    private double initialVelocity = 0;

    private static ArrayList<Vehicle> inventory = new ArrayList();
    private static ArrayList<String> type = new ArrayList();

    public Vehicle(String regNo, String color, String make, String model, int seats, double price, String engineType, double mileage) {
        this.regNo = regNo;
        this.color = color;
        this.make = make;
        this.model = model;
        this.seats = seats;
        this.price = price;
        this.engineType = engineType;
        this.mileage = mileage;
    }

    public static ArrayList getInventory() {
        return inventory;
    }

    public static int stockTaken() {
        return inventory.size();
    }

    public static void addToInventory(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public static ArrayList getType() {
        return type;
    }

    public static void setType(String vType) {
        type.add(vType);
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public abstract void info();

    public double accelerate(double finalVelocity, double time) {
        return (finalVelocity - this.initialVelocity) / time;
    }

    public double brake(double finalVelocity, double currVelocity, double time) {
        if (currVelocity == 0) {
            return currVelocity;
        } else {
            return (currVelocity - finalVelocity) / time;
        }
    }

}
