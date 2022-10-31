package class7.exs1;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TravelAgency agency=TravelAgency.getInstance(List.of(4,8,3,1));
        System.out.println(agency.vehicles);
        for (int i = 0; i < 20; i++) {
            if(!agency.availableVehicles) //If there are no available vehicles
                break;
            Passenger passenger = new Passenger();
            agency.setVehiclePassengerMap(passenger);
        }


    }

}
