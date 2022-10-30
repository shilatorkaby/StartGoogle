package class1;

import java.util.HashMap; // import the HashMap class
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.*;


public class UsersHashMap {
   public HashMap <Integer, User> Users = new HashMap<>();

    public UsersHashMap(int count) {
        setRandomUsers(Users,count); //Initialize hashmap with 10 random users
    } //Default constructor

    public int randomID() // Generate random id number
    { return (ThreadLocalRandom.current().nextInt(11111111, 99999999 + 1)); }


    public boolean randomBool() {
        Random rd = new Random(); // creating Random object
        return(rd.nextBoolean()); // return a random boolean
    }


    public String randomName() {

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

    public void setRandomUsers(HashMap <Integer, User> Users_map,int count)
    {
        int ID;
        for (int i = 0; i < count; i++) {
            ID = randomID();
            Users.put(ID, new User(randomName(), ID, randomBool()));
        }
    }


    //Create a list of Users from the hashMap
    public List<User> hashMap_to_list ()
    {
        List<User> hashList = new ArrayList(Users.values());
        return(hashList);
    }

    public void addUserWithID(int ID)
    {
        Users.put(ID, new User(randomName(), ID, randomBool()));
    }
    public User getUser (int ID) {
            List<User> listOfUsers= hashMap_to_list();
        for (User user : listOfUsers) {
            if (user.Id == ID) {
                return (user);
            }
        }
        return(null);
    }

    public int actUsers () {
        int activatedUsers = 0; //num of activate users
        for (User user : Users.values()) {
            if (user.IsActivated) {
                activatedUsers++;
            }
        }
        return(activatedUsers);
    }

    public void printUserDetailsByID(int ID)
    {
        User foundUser=getUser(ID);
        System.out.println("\nThe user that found in the List of users by his id-");
        System.out.println("Id: "+ID+ ", User-name: "+foundUser.Name +", Activate: " +foundUser.IsActivated);
    }
    public void printHashmap()
    {Users.forEach((id, user)-> System.out.println("Id:"+id+ " User-name: "+user.Name +" Activate: " +user.IsActivated));}

    public static void main(String[] args) {
    }
}



