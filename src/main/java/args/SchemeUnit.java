package args;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/13 8:05 AM
 */
public class SchemeUnit {


    private final String flag;
    private String type;

    public SchemeUnit(String schemeText) {
        this.flag = schemeText.split(":")[0];
        this.type = schemeText.split(":")[1];

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

    public String getFlag() {
        return flag;
    }

    public Object parse(String value) {
        switch (type) {
            case "bool":
                return (null == value || value.length() == 0) ? Boolean.FALSE : Boolean.valueOf(value);
            case "int":
                return Integer.valueOf(value);
            case "string":
                return value;
        }
        return null;
    }
}
