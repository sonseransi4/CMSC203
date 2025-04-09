import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Student tests for HolidayBonus
//Tests a variety of casesfor arraytypes
public class HolidayBonusTestStudent {

    private double[][] dataSetPositive;
    private double[][] dataSetWithNegatives;
    private double[][] dataSetEmptyRows;
    private double[][] test1;
    private double[][] test2;

    @Before
    public void setUp() throws Exception 
    {

        test1 = new double[][] {{500,1000,1500}};

        test2 = new double[][] {{5},{15},{25}};
    }

    @After
    public void tearDown() throws Exception
    {
        test1 = null;
        test2 = null;
    }
//"0.001
    @Test
    public void testCalculateHolidayBonusSingleRow() 
    {
        double[] result = HolidayBonus.calculateHolidayBonus(test1);
        assertEquals(15000.0, result[0],0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonusSingleRow() {
        assertEquals(15000.0, HolidayBonus.calculateTotalHolidayBonus(test1), 0.001);
    }

    @Test
    public void testCalculateHolidayBonusSingleColumn() {
        double[] result = HolidayBonus.calculateHolidayBonus(test2);
        assertEquals(1000.0,result[0],0.001);
        assertEquals(2000.0,result[1],0.001); 
        assertEquals(5000.0,result[2],0.001); 
    }

    @Test
    public void testCalculateTotalHolidayBonusSingleColumn() {
        assertEquals(8000.0, HolidayBonus.calculateTotalHolidayBonus(test2), 0.001);
    }
}
