/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class RentalRecordTest {

    public RentalRecordTest() {
    }

    /**
     * Test of getRentalDate method, of class RentalRecord.
     */
    @Test
    public void testRoleValues() {
        // Test the values() method
        Role[] roles = Role.values();
        assertEquals(2, roles.length);  // Assuming you have two values: ADMIN and STAFF

        // Test individual enum values
        assertEquals(Role.ADMIN, Role.valueOf("ADMIN"));
        assertEquals(Role.STAFF, Role.valueOf("STAFF"));
    }
}
