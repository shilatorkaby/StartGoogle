package class3.exs3;

public class Main {
 static PhoneBook phoneBook = new PhoneBook("book1");

 public static void main(String[] args) {
  phoneBook.insertContact(Name.Prefix.MRS,"Ori","Shalom", "052","3410239");
  phoneBook.insertContact(Name.Prefix.MS,"Noa","Shalom", "052","3418037");
  phoneBook.insertContact(Name.Prefix.MR,"Avi","Levi", "052","3416037");
  phoneBook.printAll();
 }

}
