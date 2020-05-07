package measure;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/7 10:55 PM
 */
public enum Unit {
    INCH(1), FOOT(12), YARD(36);

    private int unitVal;

    Unit(int unitVal) {
        this.unitVal = unitVal;
    }

    public int getUnitVal() {
        return unitVal;
    }
}
