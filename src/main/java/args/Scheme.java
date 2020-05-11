package args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 9:40 AM
 */
public class Scheme {
    private Map<String, String> schemeMap;

    public Scheme(String schemeInput) {
        schemeMap = new HashMap<>();
        Arrays.stream(schemeInput.split(",")).forEach(
                sp -> {
                    String[] split = sp.split(":");
                    schemeMap.put(split[0], split[1]);
                }
        );
    }

    public Object getValue(String flag, String value) {
        String type = schemeMap.get(flag);
        if ("bool".equals(type))
            return "true".equals(value);
        else if ("int".equals(type))
            return Integer.valueOf(value);
        else if ("string".equals(type))
            return value;
        return null;
    }
}
