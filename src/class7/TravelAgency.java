package class7;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class TravelAgency {
    Map<Vehicle,Passenger> vehiclePassengerMap;
    Map<vehicleType, Integer> vehicles;
    boolean availableVehicles=true;
    public enum vehicleType {PLANE, BUS, TAXI, BOAT}

    private static TravelAgency instance;

    public static TravelAgency getInstance(List<Integer> counts){
        if(instance==null){
            instance = new TravelAgency(counts);
        }
        return instance;
    }

    private TravelAgency(List<Integer> counts){
        vehiclePassengerMap =new HashMap<>();
        vehicles = new HashMap<>();
        int index = 0;
        for (vehicleType type : vehicleType.values()) {
            vehicles.put(type, counts.get(index));
            index += 1;
        }
    }


    public boolean vehiclesAvailable(vehicleType type) {
        Integer count = vehicles.get(type);
        if (count > 0) {
            vehicles.put(type, count - 1);
            return true;
        }
        return false;
    }

    public vehicleType getVehicle(Passenger passenger) {
        if(vehicles.values().stream().mapToInt(Integer::intValue).sum()!=0) {
            if (vehiclesAvailable(passenger.favorite))
                return passenger.favorite;
            vehicleType type = randomVehicleType();
            while (vehicles.get(type) <= 0)
                type = randomVehicleType();
            vehicles.put(type, vehicles.get(type) - 1);
            return type;
        }
        return null; //There are no available vehicles

    }

    public void setVehiclePassengerMap(Passenger passenger) {
        vehicleType type=getVehicle(passenger);
        if(type!=null) {
            Vehicle vehicle = Factory(type);
            vehiclePassengerMap.put(vehicle, passenger);
            vehicle.transport(passenger);
        }
        else {
            System.out.println("\nThere are no available vehicles\nPassengers names:");
            printAll();
            availableVehicles=false;
        }
    }

    public static vehicleType randomVehicleType() {
        return vehicleType.values()[ThreadLocalRandom.current().nextInt(vehicleType.values().length)];
    }

    public Vehicle Factory(vehicleType type) {
        switch (type) {
            case BOAT:
                return new Boat();
            case BUS:
                return new Bus();
            case TAXI:
                return new Taxi();
            case PLANE:
                return new Plane();
            default:
                throw new IllegalArgumentException("ERROR");
        }
    }

    public void printAll()
    {
        for (Map.Entry<Vehicle,Passenger> map:vehiclePassengerMap.entrySet()) {
            map.getKey().transport(map.getValue());
        }
    }



}