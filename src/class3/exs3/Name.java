package class3.exs3;

import java.util.Objects;

class Name {
    enum Prefix {MR, MS,MRS,MISS,}
    String firstName;
    String lastName;
    Prefix title;

    Name(String firstName, String lastName,Prefix Title)
 {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title=Title;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name name)) return false;
        return (firstName.equals(name.firstName) & lastName.equals(name.lastName) &title.equals(name.title));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title=" + title +
                '}';
    }

    @Override
    protected Name clone() {
        try {
            Name clone = (Name) super.clone();
            clone.firstName = firstName;
            clone.lastName=lastName;
            clone.title=title;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public int compareTo(Name o) {
         int result = firstName.compareTo(o.firstName);
         if(result == 0){
                return lastName.compareTo(o.lastName);
            }else{
                return result;
            }
        }
    }



