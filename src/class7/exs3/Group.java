package class7.exs3;

import java.util.concurrent.ThreadLocalRandom;

public class Group implements Export {
    int id;
    int size;

    public Group() {
        this.id = ThreadLocalRandom.current().nextInt(100000000,999999999);
        this.size = ThreadLocalRandom.current().nextInt(3,20);
    }

    @Override
    public String visit(Visitor visitor) {
        return ("{\"Id\": " + id+",\"Size\": " + size+"}");
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
