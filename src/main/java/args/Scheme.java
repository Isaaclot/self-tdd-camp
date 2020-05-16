package args;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/13 7:28 AM
 */
public class Scheme {
    private List<SchemeUnit> schemeUnitList = new ArrayList<>();

    public Scheme(String scheme) {
        Arrays.stream(scheme.split(",")).filter(s-> s.length() != 0).forEach(s -> {
            schemeUnitList.add(new SchemeUnit(s));
        });

    }

    public Object get(String type, String value) {
        return schemeUnitList
                .stream()
                .filter(s -> s.getFlag().equals(type))
                .findAny()
                .get()
                .parse(value);
    }
}
