package args;

/**
 *
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 9:35 AM
 */
public class Args {
    private final Scheme scheme;
    private final Command command;

    public Args(String scheme, String command) {
        this.scheme = new Scheme(scheme);
        this.command = new Command(command);
    }

    public Object get(String flag) {
        return scheme.getValue(flag, command.get(flag) + "");
    }
}
