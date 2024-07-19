/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author himani.walia
 */
public class ReturnRecordIT {
    
    public ReturnRecordIT() {
    }

    /**
     * Test of getCustomerID method, of class ReturnRecord.
     */
    @Test
     public void testGettersAndSetters() {
        // Create a ReturnRecord object
        ReturnRecord returnRecord = new ReturnRecord();

        // Set values using setters
        returnRecord.setCustomerID("CUST001");
        returnRecord.setCustomerName("John Doe");
        returnRecord.setCarRegisterationNo("ABC123");
        returnRecord.setStatus(StatusoftheCar.InShop);

        // Test if values are retrieved correctly using getters
        assertEquals("CUST001", returnRecord.getCustomerID());
        assertEquals("John Doe", returnRecord.getCustomerName());
        assertEquals("ABC123", returnRecord.getCarRegisterationNo());
        assertEquals(StatusoftheCar.InShop, returnRecord.getStatus());
    }
    
}
