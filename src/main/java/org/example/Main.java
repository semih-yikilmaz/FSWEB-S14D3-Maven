package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("carA", "gas powered car", 2.0, 4);
        CarSkeleton electricCar = new ElectricCar("carB", "electric car", 3.3, 5);
        CarSkeleton hybridCar = new HybridCar("carC", "hybrid car", 1.5, 4, 3);

        gasCar.startEngine();
        gasCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();

        System.out.println(gasCar.getClass().getSimpleName());
        System.out.println(electricCar.getClass().getSimpleName());
        System.out.println(hybridCar.getClass().getSimpleName());
    }
}