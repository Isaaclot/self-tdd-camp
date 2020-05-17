package taximeter;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 2:34 PM
 */
public class TaxiMeter {
    public int miles;
    public int waitMinutes;

    public TaxiMeter(int miles, int waitMinutes) {
        this.miles = miles;
        this.waitMinutes = waitMinutes;
    }

    public int charge() {
        int baseCharge = 6;
        if (miles > 2 && miles <= 8) {
            baseCharge += Math.ceil((miles - 2) * 0.8);
        }
        if (miles > 8) {
            baseCharge += Math.ceil((8 - 2) * 0.8);
            baseCharge += (miles - 8) * (0.8 + 0.8 * 0.5);
        }
        baseCharge += (int) Math.ceil(waitMinutes * 0.25);
        return baseCharge;
    }
}
