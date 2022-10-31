package class7;

public class Bus implements Vehicle{
    @Override
    public void transport(Passenger passenger) {
        System.out.println("Passenger's name: "+passenger.name);
    }
}
