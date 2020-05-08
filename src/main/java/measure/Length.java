package measure;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/7 10:54 PM
 */
public class Length {

    private double amount;

    public Length(Unit unit, int input) {
        this.amount = unit.getUnitVal() * input;
    }

    @Override
    public boolean equals(Object o) {
        return amount == ((Length) o).amount;
    }

}
