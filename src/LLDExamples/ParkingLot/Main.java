package LLDExamples.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                spots.add(new ParkingSpot(i, 10));
            else
                spots.add(new ParkingSpot(i, 20));
        }

        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        EntranceGate entranceGate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        Vehicle vehicle = new Vehicle(123, VehicleType.TwoWheeler);
        ParkingSpot spot = entranceGate.findParkingSpace(vehicle.vehicleType, spots);
        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        exitGate.removeVehicle(ticket);
    }
}
