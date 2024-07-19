/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class RoleTest {

    public RoleTest() {
    }

    /**
     * Test of values method, of class Role.
     */
    @Test
    public void testRoleEnumValues() {
        // Test if the enum contains the expected values
        Role[] roles = Role.values();
        assertEquals(2, roles.length);

        assertEquals(Role.ADMIN, roles[0]);
        assertEquals(Role.STAFF, roles[1]);
    }

    @Test
    public void testRoleEnumToString() {
        // Test the toString method of the enum
        assertEquals("ADMIN", Role.ADMIN.toString());
        assertEquals("STAFF", Role.STAFF.toString());
    }
}
