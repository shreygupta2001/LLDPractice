package DesignPatterns.FactoryPattern;

abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("Two Wheeler");
    }
}

class FourWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("Four Wheeler");
    }
}

interface VehicleFactory{
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
class Client {
    private final Vehicle pVehicle;

    public Client(VehicleFactory vehicleFactory){
        this.pVehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getpVehicle(){
        return pVehicle;
    }
}

public class VehicleFactoryApp {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory  = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getpVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getpVehicle();
        fourWheeler.printVehicle();
    }
}
