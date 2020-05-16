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
            Argument argument = new Argument(commandText[i], commandText[i + 1]);
            argumentList.add(argument);
        }
    }

    public int size() {
        return argumentList.size();
    }

    public Object specOf(String flag) {
        Optional<Argument> argument = argumentList.stream().filter(ar -> ar.getFlag().equals(flag)).findAny();
        return schemeText.get(flag, argument.orElseGet(null).getRawValue());
    }
}
