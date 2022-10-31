package class7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Passenger {
    String name;
    TravelAgency.vehicleType favorite;

    public Passenger() {
        this.name = randomName();
        this.favorite = TravelAgency.randomVehicleType();
    }

  String randomName()  {
      try{
          List<String> names = Files.readAllLines(Paths.get("hiNames.txt"));
          return (names.get(ThreadLocalRandom.current().nextInt(names.size()))); //return random name from names list
      }
      catch (IOException e)
      {
       System.out.println("ERROR in reading from file");
      }
return null;

  }

}
