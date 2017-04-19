package java.task3;

import java.util.List;

/**
 * Created by TimeLine on 19.04.2017.
 */
public class Build {

    private final int id;
    private final List<Address> addresses;

    public Build(int id, final List<Address> addresses) {
        this.id = id;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Build build = (Build) o;

        return id == build.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

