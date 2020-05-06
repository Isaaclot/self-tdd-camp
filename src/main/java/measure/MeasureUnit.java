package measure;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/6 10:53 AM
 */
public class MeasureUnit {
    private final int value;
    private final String unit;

    public MeasureUnit(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public int parse(String targetUnit) {
        if ("foot".equals(unit)) {
            if ("inch".equals(targetUnit)) {
                return value * 12;
            }
            if ("yard".equals(targetUnit)) {
                return value / 3;
            }
        }
        if ("inch".equals(unit)) {
            if ("yard".equals(targetUnit)) {
                return value / 36;
            } else if ("foot".equals(targetUnit)) {
                return value / 12;
            }
        }
        if ("yard".equals(unit)) {
            if ("inch".equals(targetUnit)) {
                return value * 36;
            }
            if ("foot".equals(targetUnit)) {
                return value * 3;
            }
        }
        return 0;
    }
}
