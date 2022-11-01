package class7.exs3;

import java.util.concurrent.ThreadLocalRandom;

public class User implements Export{
    int id;
    String name;
    String password;

    public User(String name, String password) {
        this.id = ThreadLocalRandom.current().nextInt(100000000,999999999);
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public String visit(Visitor visitor) {
        return ("{\"Id\": " + id+",\"Name\": \"" + name+"\",\"Password\": \"" + password+"\"}");


    }
}
