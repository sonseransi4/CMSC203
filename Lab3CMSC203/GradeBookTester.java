import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

//No tostring tester was clarified in the lab so assumed it wasn't directly needed, unless it was being used in the test for adding score.

class GradeBookTester
{
    private GradeBook objectOne, objectTwo;

    @BeforeEach
    void setUp() throws Exception 
    
    
    {
        objectOne = new GradeBook(5); //Sets limit on the amount to 5
        objectTwo = new GradeBook(5);

        objectOne.addScore(35.0);
        objectOne.addScore(75.0);
//two gradebook objects, together, a combined holding of 5.
        objectTwo.addScore(88.0);
        objectTwo.addScore(90.0);
        objectTwo.addScore(100.0);
    }

    @AfterEach
    void tearDown() throws Exception
    {
        objectOne = null;
        objectTwo = null;
    }

    @Test
    void testAddScore() 
    {
        assertEquals("35.0 75.0 ", objectOne.toString());
        
        assertEquals("88.0 90.0 100.0 ", objectTwo.toString());
       
    }
    
    @Test
    public void testGetScoreSize()
    {
        assertEquals(2, objectOne.getScoreSize());
        assertEquals(3, objectTwo.getScoreSize());
        
    }
  

    @Test
    void testFinalScore() 
    {
        assertEquals(75.0, objectOne.finalScore());
        
        assertEquals(190.0, objectTwo.finalScore());
    }
    
    
    @Test
    void testSum() 
    {
        assertEquals(110.0, objectOne.sum());
        assertEquals(278.0, objectTwo.sum());
    }

    @Test
    void testMinimum()
    {
    	
        assertEquals(35.0, objectOne.minimum());
        assertEquals(88.0, objectTwo.minimum());
    }
    
    
    
}
