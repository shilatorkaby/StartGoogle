package class7.exs3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Export> exports = new ArrayList<>();
        exports.add(new User("Moshe","moshe123"));
        exports.add(new Group());
        exports.add(new Asset("PPD"));

        CleaningVisitor cleaningVisitor = new CleaningVisitor();
                for (Export export:exports) {
                   System.out.println(export.getClass()+export.visit(cleaningVisitor)+"\n"); // data is a JSON string here
                }
        }
    }

