package args;

/**
 * @since 2020/5/9 11:56 PM
 */
public class Scheme {

    public Object value;
    public String flag;

    public Scheme(String flag, Object value) {
        this.flag = flag;
        this.value = value;
    }
}
