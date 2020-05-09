package args;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 12:03 AM
 */
public class Parse {
    public Map<String, Scheme> schemeMap = new HashMap<>();

    public Parse(String flag) {
        String[] split = flag.split("-");
        for (String cs : split) {
            if (null == cs || cs.length() == 0) continue;
            String key = cs.split(" ")[0];
            schemeMap.put(key, new Scheme(key, formatValue(cs)));
        }
    }

    private Object formatValue(String flag) {
        String[] s = flag.split(" ");
        Object x = getDefaultValue(s);
        if (x != null) return x;
        return s[1];
    }

    private Object getDefaultValue(String[] s) {
        if ("l".equals(s[0]))
            return s.length >= 2 && Boolean.valueOf(s[1]);
        if ("p".equals(s[0]))
            return s.length < 2 ? 0 : Integer.valueOf(s[1]);
        if ("d".equals(s[0]) && s.length < 2) {
            return "";
        }
        return null;
    }

}
