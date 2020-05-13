package args;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/13 8:05 AM
 */
public class SchemeUnit {

    private String type;

    public SchemeUnit(String type) {
        this.type = type;
    }

    public Object getDefault() {
        switch (type) {
            case "bool":
                return false;
            case "int":
                return 0;
            case "string":
                return "";
        }
        return null;
    }


    public String getType() {
        return type;
    }

    public Object parse(String value) {
        switch (type) {
            case "bool":
                return Boolean.valueOf(value);
            case "int":
                return Integer.valueOf(value);
            case "string":
                return value;
        }
        return null;
    }
}
