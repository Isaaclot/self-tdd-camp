package args;

import javafx.beans.binding.Bindings;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:28 AM
 */
public class ArgumentSpec {
    private String flag;
    private String rawValue;

    public ArgumentSpec(String flag, String rawValue) {
        this.flag = flag;

        this.rawValue = rawValue;
    }

    public String getRawValue() {
        return rawValue;
    }

    public String getFlag() {
        return flag;
    }
}
