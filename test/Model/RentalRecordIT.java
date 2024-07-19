/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import static Model.Gender.MALE;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author himani.walia
 */
public class RentalRecordIT {
    @Test
    public void testGetCustomerID() {
        // Create a ReturnRecord object
        ReturnRecord returnRecord = new ReturnRecord();

        // Set and get CustomerID
        returnRecord.setCustomerID("CUST001");
        assertEquals("CUST001", returnRecord.getCustomerID());
    }

    @Test
    public void testGetCustomerName() {
        // Create a ReturnRecord object
        ReturnRecord returnRecord = new ReturnRecord();

        // Set and get CustomerName
        returnRecord.setCustomerName("John Doe");
        assertEquals("John Doe", returnRecord.getCustomerName());
    }

    @Test
    public void testGetCarRegisterationNo() {
        // Create a ReturnRecord object
        ReturnRecord returnRecord = new ReturnRecord();

        // Set and get CarRegisterationNo
        returnRecord.setCarRegisterationNo("ABC123");
        assertEquals("ABC123", returnRecord.getCarRegisterationNo());
    }

    @Test
    public void testGetStatus() {
        // Create a ReturnRecord object
        ReturnRecord returnRecord = new ReturnRecord();

        // Set and get Status
        returnRecord.setStatus(StatusoftheCar.InShop);
        assertEquals(StatusoftheCar.InShop, returnRecord.getStatus());
    }


    

}
