package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle blueair = new Airplane();
        Vehicle redair = new Airplane();
        Vehicle trainone = new Train();
        Vehicle traintwo = new Train();
        Vehicle ogangebus = new Bus();
        Vehicle bustwo = new Bus();
        Vehicle[] vehicles = new Vehicle[] {blueair, trainone, redair, ogangebus, traintwo, bustwo};
        for (Vehicle a : vehicles) {
            a.move();
            a.description();
        }
    }
}
