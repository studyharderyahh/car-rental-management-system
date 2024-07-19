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
public class StatusoftheCarTest {
    
    public StatusoftheCarTest() {
    }

    /**
     * Test of values method, of class StatusoftheCar.
     */
    @Test
    public void testValues() {
        assertEquals(3, StatusoftheCar.values().length);
        assertEquals(StatusoftheCar.InShop, StatusoftheCar.valueOf("InShop"));
        assertEquals(StatusoftheCar.RentedOut, StatusoftheCar.valueOf("RentedOut"));
        assertEquals(StatusoftheCar.UnderManintance, StatusoftheCar.valueOf("UnderManintance"));
   
    }
    @Test
    
   public  void testStatusOrder() {
        // Check if the order of StatusoftheCar values is as expected
        StatusoftheCar[] expectedOrder = {StatusoftheCar.InShop, StatusoftheCar.RentedOut, StatusoftheCar.UnderManintance};
        assertArrayEquals(expectedOrder, StatusoftheCar.values());
    }
    
    
}
