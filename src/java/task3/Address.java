package java.task3;

/**
 * Created by TimeLine on 19.04.2017.
 */
public class Address {

    private final Street street;
    private final int number;

    public Address(Street street, int number) {
        this.street = street;
        this.number = number;
    }

    public Street getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (number != address.number) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }
}
