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
    private List<SchemeUnit> schemeUnitList;

    public Scheme(String scheme) {
        schemeUnitList = new ArrayList<>();
        Arrays.asList(scheme.split(",")).forEach(s -> {
            schemeUnitList.add(new SchemeUnit(s.split(":")[1]));
        });

    }

    public Object get(String type, String value) {
        return schemeUnitList.stream().filter(s -> s.getType().equals(type)).findAny().orElseGet(null).parse(value);
    }
}
