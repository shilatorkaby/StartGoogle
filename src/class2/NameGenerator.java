package class2;
import java.util.*;
import java.io.*;

public class NameGenerator {
    List <String> names;

    public NameGenerator(String path) throws IOException //import names from a txt file
           {
            names = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line;
            while ((line = br.readLine()) != null)
                names.add(line);
           }

    public String getRandomName() throws Exception {
        Random r = new Random();
        return(names.get(r.nextInt(names.size()))); //return random name from names list
    }

}
