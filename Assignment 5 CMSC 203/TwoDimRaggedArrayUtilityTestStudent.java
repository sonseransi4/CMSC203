import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Student tests for TwoDimRaggedArrayUtility
public class TwoDimRaggedArrayUtilityTestStudent
{
    private double[][] test1 = {{1,2,3},{4,5},{6,7,8,9}};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
//Margin of error: 0.001, when dealing with doubles to deal with roundingissues.
   //tests get row
    @Test
    public void testGetRowTotal() {
        assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(test1, 1),0.001);
    }

//Tests getTotal
    @Test
    public void testGetTotal() {
        assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(test1),0.001);
    }

   //Tests getAverage
    @Test
    public void testGetAverage() {
        assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(test1),0.001);
    }

//Tests getLowestInArray
    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(test1),0.001);
    }

}
