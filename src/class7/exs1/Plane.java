package class7.exs1;

public class Plane implements Vehicle {

      @Override
    public void transport(Passenger passenger) {
        System.out.println("Passenger's name: "+passenger.name);
    }


}
