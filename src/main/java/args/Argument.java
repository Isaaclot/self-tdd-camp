package args;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 12:29 AM
 */
public class Argument {
    private String flag;
    private String rawValue;

    public Argument(String flag, String rawValue) {
        this.flag = flag.replaceFirst("-", "");

        this.rawValue = rawValue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }
}
