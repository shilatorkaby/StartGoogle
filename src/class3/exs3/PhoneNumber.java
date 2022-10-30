package class3.exs3;

import java.util.Objects;

class PhoneNumber {
    String areaCode;
    String number;

    PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber that)) return false;
        return areaCode.equals(that.areaCode) && number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode='" + areaCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    protected PhoneNumber clone() {
        try {
            PhoneNumber clone = (PhoneNumber) super.clone();
            clone.areaCode = areaCode;
            clone.number=number;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
