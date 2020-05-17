package args;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/14 8:14 AM
 */
public class Args {
    private Scheme schemeText;
    private String[] commandText;

    private List<Argument> argumentList = new ArrayList<>();

    public Args(Scheme schemeText, String[] commandText) {
        this.schemeText = schemeText;
        this.commandText = commandText;

        for (int i = 0; i < commandText.length; i += 2) {
            String rawValue = commandText[i + 1];
            String flag = commandText[i];
            if (isDefaultRawValue(rawValue)) {
                i--;
                rawValue = "";
            }
            argumentList.add(new Argument(flag, rawValue));
        }
    }

    private boolean isDefaultRawValue(String rawValue) {
        return rawValue.startsWith("-") && rawValue.charAt(1) > '9';
    }

    public int size() {
        return argumentList.size();
    }

    public Object specOf(String flag) {
        Optional<Argument> argument = argumentList.stream().filter(ar -> ar.getFlag().equals(flag)).findAny();
        return schemeText.get(flag, argument.orElseGet(null).getRawValue());
    }
}
