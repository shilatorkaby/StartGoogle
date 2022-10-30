package class4.exs4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Generic {
    public static <T> void main(String[] args) throws Exception {

        Callable<Integer> IntegerCallable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                return ThreadLocalRandom.current().nextInt(10);
            }
        };

        Callable<String> stringCallable = new Callable<>() {
            @Override
            public String call() throws Exception {
                return getName();
            }
        };

        System.out.println(retry(IntegerCallable, 3, 10, 1));
        System.out.println(retry(IntegerCallable, 5));
        System.out.println(retry(stringCallable, "Candice", 10, 1));
        System.out.println(retry(stringCallable, "Rosalee", 5));
    }

    public static <T> T retry(Callable<T> action, T expectedResult, int maxRetries, int sleep) {
        int counter = 0;
        T result = (T) action;
        while (counter < maxRetries && result != expectedResult) {
            try {
                TimeUnit.SECONDS.sleep(sleep);
                result = action.call();
            } catch (Exception e) {
                throw new RuntimeException("Not expected result!", e);
            }
            counter++;
        }
        return result;
    }

    public static <T> T retry(Callable<T> action, T expectedResult, int maxRetries) {
        return retry(action,expectedResult,maxRetries,2);
    }

    public static <T> T retry(Callable<T> action, T expectedResult) {
        return retry(action,expectedResult,7,1);
    }

    static List<String> listOfFirstName = Arrays.asList("Karen",
            "Jolene",
            "Jenna",
            "Bob",
            "Candice",
            "George",
            "Emely",
            "Barry",
            "Rosalee",
            "Sebastian",
            "Shalom"
    );

    public static String getName() {
        int randomNum = ThreadLocalRandom.current().nextInt(listOfFirstName.size() + 1);
        return listOfFirstName.get(randomNum);
    }

}