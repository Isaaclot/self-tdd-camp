package args;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 8:55 AM
 */
public class Arguments {
    private Schemes schemes;

    private List<ArgumentSpec> argumentSpecList = new ArrayList<>();

    public Arguments(Schemes schemes, String[] args) {
        this.schemes = schemes;
        initArgumentList(args);

    }

    private void initArgumentList(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            String flag = args[i];
            String rawValue = args[i + 1];
            if (isDefaultRaw(rawValue)) {
                i--;
                rawValue = "";
            }
            argumentSpecList.add(new ArgumentSpec(flag.substring(1), rawValue));
        }
    }

    private boolean isDefaultRaw(String rawValue) {
        return rawValue.startsWith("-") && rawValue.charAt(1) > '9';
    }

    public Object get(String flag) {
        String rawValue = argumentSpecList.stream().filter(as -> flag.equals(as.getFlag())).findAny().get().getRawValue();
        return schemes.parseOf(flag, rawValue);
    }
}
