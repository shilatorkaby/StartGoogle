package class1;

public class Main {

    public static void main(String[] args) {
        UsersHashMap user = new UsersHashMap(10);

        //display all users
        user.printHashmap();

        //Insert specific user for the search exemple:
        int ID = user.randomID();
        user.addUserWithID(ID); //Add a user with a specific id number
        user.printUserDetailsByID(ID); //Print the details of the found user (after searching him by his id)

        //Counting the activated users
        System.out.println("\n\n"+user.actUsers()+" Users are activated.");
    }
}
