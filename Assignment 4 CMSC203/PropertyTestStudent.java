import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

//Student Property Test
class PropertyTestStudent {
	Property propertyOne;

	@BeforeEach
	void setUp() throws Exception {
		
		propertyOne = new Property("Georgetown Loft", "WashingtonDC", 3200.00, "GeorgetownUni");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		propertyOne = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Georgetown Loft", propertyOne.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(3200.00, propertyOne.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propertyOne.getPlot().getX());
		assertEquals(0, propertyOne.getPlot().getY());
		assertEquals(1, propertyOne.getPlot().getWidth());
		assertEquals(1, propertyOne.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Georgetown Loft,WashingtonDC,GeorgetownUni,3200.0", propertyOne.toString());	
	}
	
	
}
