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
 public class Car extends Vehicle{

    private int doors;
    private int wheels;
    private boolean ac;
    
    private static ArrayList <Car> inventory = new ArrayList();;
    
    public Car(String regNo, String color, String make, String model, int seats, double price, String engineType, double mileage, int doors, int wheels, boolean ac) {
        super(regNo, color, make, model, seats, price, engineType, mileage);
        this.doors = doors;
        this.wheels = wheels;
        this.ac = ac;
    }
    
    public static ArrayList getInventory() {
        return inventory;
    }

    public static int stockTaken() {
        return inventory.size();
    }

    public static void addToInventory(Car car) {
        inventory.add(car);
    }
    
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }
    
    @Override
    public void info() {
        System.out.println("Car Details: ");
        System.out.println("Registration No: " + this.getRegNo());
        System.out.println("Make: " + this.getMake());
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("AC Working?: " + this.isAc());
        System.out.println("Price: " + this.getPrice());
        System.out.println();
    }
}
  

