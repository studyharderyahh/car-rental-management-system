/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a2597
 */
public class EmployeeAndCustomerManagementSystemTest {
  
    public EmployeeAndCustomerManagementSystemTest() {
    }

    /**
     * Test of main method, of class EmployeeAndCustomerManagementSystem.
     */
    
     @Test
    public void testLogin() {
        // Simulate a successful login
        assertTrue(loginFormTesting.login("testUser", "testPass"));

        // Simulate a failed login with incorrect credentials
        assertFalse(loginFormTesting.login("testUser", "incorrectPass"));

        // Simulate a failed login with a non-existing username
        assertFalse(loginFormTesting.login("nonExistingUser", "anyPassword"));
    }
    
}
