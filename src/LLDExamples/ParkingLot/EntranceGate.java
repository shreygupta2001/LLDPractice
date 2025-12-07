package LLDExamples.ParkingLot;

import java.util.List;
import java.time.Instant;

public class EntranceGate {
    ParkingSpotManagerFactory factory;

    EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager manager = factory.getParkingSpotManager(vehicleType, spots);
        return manager.findParkingSpace();
    }

    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        long currentTime = Instant.now().toEpochMilli();
        return new Ticket(currentTime, parkingSpot, vehicle);
    }
}
