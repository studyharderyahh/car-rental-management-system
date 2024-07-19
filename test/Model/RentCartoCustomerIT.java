/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import static Model.StatusoftheCar.InShop;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author himani.walia
 */
public class RentCartoCustomerIT {
    
    private RentCartoCustomer rentCarSystem;

   

    @Before
    public void setUp() {
        rentCarSystem = new RentCartoCustomer("","","",InShop);
        rentCarSystem.cardetails(); // Initialize car details
        rentCarSystem.CustomerDetails(); // Initialize customer details
    }

   

    @Test
    public void testSetCustomerName() {
        // Test if setting customer name works for the first customer
        String newCustomerName = "New Name";
        rentCarSystem.customerList.get(0).setCustomerName(newCustomerName);
        assertEquals(newCustomerName, rentCarSystem.customerList.get(0).getCustomerName());
    }

    @Test
    public void testSetDueDate() {
        // Test if setting due date works for the first car
        Date newDueDate = new Date();
        rentCarSystem.customerList.get(0).setDuedate(newDueDate);
        assertEquals(newDueDate, rentCarSystem.customerList.get(0).getDuedate());
    }

    
    
}
