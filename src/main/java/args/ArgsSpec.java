package args;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/14 8:22 AM
 */
public class ArgsSpec {
    private String flag;
    private Scheme scheme;

    public ArgsSpec(String flag, Scheme scheme) {
        this.flag = flag;
        this.scheme = scheme;
    }

    public String getFlag() {
        return flag;
    }
}
