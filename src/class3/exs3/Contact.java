package class3.exs3;

import java.util.Objects;

import static java.util.Objects.compare;
class Contact {
 Name name;
 PhoneNumber phoneNumber;

    Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    // compareTo()
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Contact)) return false;
     Contact contact = (Contact) o;
     return (name == contact.name && Objects.equals(name, contact.name) &
     phoneNumber == contact.phoneNumber && Objects.equals(phoneNumber, contact.phoneNumber));

 }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    protected Contact clone() {
        try {
            Contact clone = (Contact) super.clone();
            clone.name = name.clone();
            clone.phoneNumber=phoneNumber.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    public int compare(Contact o) {
        return(name.compareTo(o.name));
    }


}
