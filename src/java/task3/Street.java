package java.task3;

/**
 * Created by TimeLine on 19.04.2017.
 */
public class Street {

    private final String name;

    public Street(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Street street = (Street) o;

        return name != null ? name.equals(street.name) : street.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}


