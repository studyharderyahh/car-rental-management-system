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
public class CustomerTest {

    public CustomerTest() {
    }

    /**
     * Test of getLicenseNumber method, of class Customer.
     */
    @Test
    public void testCustomer() {
        // Create a sample Date for testing
        Date sampleDate = new Date();

        // Create a sample Customer
        Customer customer = new Customer("123ABC", "Regular", sampleDate, "ID123", "John Doe", Gender.MALE, sampleDate, "123 Main St", "555-1234");

        // Test getter methods
        assertEquals("123ABC", customer.getLicenseNumber());
        assertEquals("Regular", customer.getLicenseType());
        assertEquals(sampleDate, customer.getLicenseExpiryDate());
        assertEquals("ID123", customer.getPersonID());
        assertEquals("John Doe", customer.getName());
        assertEquals(Gender.MALE, customer.getGender());
        assertEquals(sampleDate, customer.getDateOfBirth());
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("555-1234", customer.getPhone());

        // Test setter methods
        customer.setLicenseNumber("456DEF");
        assertEquals("456DEF", customer.getLicenseNumber());

        customer.setLicenseType("Premium");
        assertEquals("Premium", customer.getLicenseType());

        Date newExpiryDate = new Date();
        customer.setLicenseExpiryDate(newExpiryDate);
        assertEquals(newExpiryDate, customer.getLicenseExpiryDate());

        // Test customerToString method
        String expectedString = "ID123,John Doe,555-1234,123 Main St";
        assertEquals(expectedString, customer.customerToString());
    }

}
