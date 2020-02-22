 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author USER
 */
public class VehicleParkingSystem {

    public static void main(String... jaja) {
        Car myLambo = new Car("ALU-419-DD", "Purple", "Lambo", "Aventador", 2, 3500000, "V-12 Turbo Charged", 0, 2, 4, true);
        Car.addToInventory(myLambo);
        Vehicle.addToInventory(myLambo);

        Truck urTruck = new Truck("SMK-567-DT", "Yellow", "Benz", "DXZ", 5, 20500, "V-8", 0, false);
        Truck.addToInventory(urTruck);
        Vehicle.addToInventory(urTruck);

        myLambo.info();
        urTruck.info();

        System.out.println("Cars: " + Car.stockTaken());
        System.out.println("Trucks: " + Truck.stockTaken());
        System.out.println("Total vehicle: " + Vehicle.stockTaken());

//        System.out.println();
//        for (Object vehicle : Vehicle.getInventory()) {
//            ((Vehicle) vehicle).info();
//        }
            
    }
}
