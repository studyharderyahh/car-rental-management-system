/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author himani.walia
 */
public class BodyTypeofCarTest {
    
    public BodyTypeofCarTest() {
    }
    @Test
   public void testEnumValues() {
        // Test if the enum values match the expected values
        assertEquals("SEDAN", BodyTypeofCar.SEDAN.toString());
        assertEquals("HATCHBACK", BodyTypeofCar.HATCHBACK.toString());
        assertEquals("VAN", BodyTypeofCar.VAN.toString());
        assertEquals("SUV", BodyTypeofCar.SUV.toString());
    }
    
    
}
