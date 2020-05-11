package args;

import java.util.*;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 10:14 AM
 */
public class Command {
    private Map<String, String> commandMap = new HashMap<>();

    public Command(String command) {
        ListIterator<String> flagValueIterator = Arrays.asList(command.split("\\s+")).listIterator();
        while (flagValueIterator.hasNext()) {
            String name = flagValueIterator.next().substring(1);
            String next = flagValueIterator.next();
            if (next.startsWith("-") && next.charAt(1) > '9') {
                flagValueIterator.previous();
                commandMap.put(name, null);
            } else {
                commandMap.put(name, next);
            }
        }

    }

    public Object get(String flag) {
        String value = commandMap.get(flag);
        if ("l".equals(flag) && Objects.isNull(value)) {
            return "false";
        }
        return value;
    }
}
