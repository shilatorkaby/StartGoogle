package class3.exs3;
import java.util.*;
import java.util.Collections.*;

public class PhoneBook {
    public List<Contact> Contacts;
    public String name;

    public PhoneBook(String name) {
        Contacts =new ArrayList<>();
        this.name = name;
    }
    
    public void insertContact(Name.Prefix title,String fname, String lname, String area, String num) {
        Contacts.add(new Contact(new Name(fname, lname,title), new PhoneNumber(area,num)));
    }

    public void printAll()
    {
        Contacts.sort(Contact::compare);
        System.out.println("Name of phone-book: "+name);
        Contacts.forEach((contact) -> System.out.println(contact.toString()));

    }
    }

