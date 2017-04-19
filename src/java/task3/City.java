package java.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by TimeLine on 19.04.2017.
 */
public class City {

    private final ConcurrentHashMap<Integer, Build> builds = new ConcurrentHashMap<>();

    public void create(final Build build) {
        this.builds.put(build.getId(), build);
    }

    public void update(final Build build) {
        this.builds.put(build.getId(), build);
    }

    public Build read(final int id) {
        return this.builds.get(id);
    }

    public void delete(final int id) {
        this.builds.remove(id);
    }

    interface Predict {
        boolean is(Address address);
    }

    private <T> List<Build> searchByPredict(final Predict predict) {
        List<Build> result = new ArrayList<>();
        for (Build build : this.builds.values()) {
            for (Address address : build.getAddresses()) {
                if (predict.is(address)) {
                    result.add(build);
                }
            }
        }
        return result;
    }

    public List<Build> searchByName(String name) {
        return this.searchByPredict(
                (address) -> address.getStreet().getName().contains(name)
        );
    }

    public List<Build> searchByRange(String name, int begin, int end) {
        return this.searchByPredict(
                (address) -> address.getNumber() > begin &&
                        address.getNumber() < end &&
                        address.getStreet().getName().contains(name)
        );
    }
}


