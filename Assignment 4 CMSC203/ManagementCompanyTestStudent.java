

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//less extensive testing due to ManagementCompany already being supplied 
public class ManagementCompanyTestStudent {

    Property sampleProperty;
    ManagementCompany managementCo;

    @Before
    public void setUp() throws Exception {
        managementCo = new ManagementCompany("Test", "987654321", 8);
    }

    @After
    public void tearDown() throws Exception {
        managementCo = null;
    }

    @Test
    public void testAddProperty() {
        sampleProperty = new Property("RealPlace", "Maple Street", 3150.50, "James Ellsworth", 1, 3, 3, 2);
        assertEquals(0, managementCo.addProperty(sampleProperty), 0); 
    }

    @Test
    public void testGetPropertiesCount() {
        sampleProperty = new Property("Terminator street", "Hollywood blvd", 4200.75, "James Cameron", 4, 6, 1, 2);
        assertEquals(0, managementCo.addProperty(sampleProperty), 0);
        assertEquals(1, managementCo.getPropertiesCount());
    }

    
}
