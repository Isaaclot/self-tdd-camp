package args;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:11 AM
 */
public class SchemeFlag {
    private String flag;
    private String type;

    public SchemeFlag(String flag, String type) {
        this.flag = flag;
        this.type = type;
    }

    public String getFlag() {
        return flag;
    }

    public String getType() {
        return type;
    }

    public Object parseOf(String value) {
        switch (type) {
            case "bool":
                return "true".equals(value);
            case "int":
                return value == null || value.length() == 0 ? 0 : Integer.parseInt(value);
        }
        return value;
    }


}
