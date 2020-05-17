package taximeter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 2:29 PM
 */
public class TaxiMeterTest {
    @Test
    public void should_create_taxi_meter(){
        TaxiMeter taxiCharge = new TaxiMeter(2, 0);
            assertThat(taxiCharge.miles, is(2));
            assertThat(taxiCharge.waitMinutes, is(0));
    }

    @Test
    public void should_charge_2_miles_0_minutes(){
        TaxiMeter tm = new TaxiMeter(2,0);
        assertThat(tm.charge(), is(6));
    }

    @Test
    public void should_charge_3_miles_0_minutes(){
        TaxiMeter taxiMeter = new TaxiMeter(3,0);
        assertThat(taxiMeter.charge(), is(7));
    }
    
    @Test
    public void should_charge_10_miles_0_minutes(){
        TaxiMeter taxiMeter = new TaxiMeter(10,0);
        assertThat(taxiMeter.charge(), is(13));
    }

    @Test
    public void should_should_charge_2_miles_3_minutes(){
        TaxiMeter taxiMeter = new TaxiMeter(2,3);
        assertThat(taxiMeter.charge(), is(7));
    }
}
