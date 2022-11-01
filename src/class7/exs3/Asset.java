package class7.exs3;
import java.util.concurrent.ThreadLocalRandom;

public class Asset implements Export {
    int serialNumber;
    String owner;
    int rating;

    public Asset(String owner) {
        this.serialNumber = ThreadLocalRandom.current().nextInt(1000,9999);
        this.owner = owner;
        this.rating = ThreadLocalRandom.current().nextInt(1,10);

    }

    @Override
    public String toString() {
        return "Asset{" +
                "serialNumber=" + serialNumber +
                ", owner='" + owner + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public String visit(Visitor visitor) {
        return ("{\"Serial number\": " + serialNumber+",\"Owner\": \"" + owner+"\",\"Rating\": " + rating+"}");

    }
}
