package class4.exs3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Random;

public class Main {


    public static String randomName() {

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }
        return (sb.toString());
    }

    public static Optional<Object> getObject(Object object) {
        try{
            Class<?> clz = object.getClass();
            Constructor<?> constructor = clz.getConstructor(String.class);
            return(Optional.of(constructor.newInstance(randomName())));
        }
        catch (NoSuchMethodException e)
        {
            return Optional.empty();
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException("ERROR - missing matching constructor".toString());
        }

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Optional<Object> girl= getObject(new Girl("Noa"));
        System.out.println("Girl is exist: "+girl.isPresent());

        Optional<Object> boy=getObject(new Boy());
        System.out.println("Boy is exist: "+boy.isPresent());


    }

}
