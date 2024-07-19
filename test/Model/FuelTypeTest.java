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
public class FuelTypeTest {
    
    public FuelTypeTest() {
    }

    /**
     * Test of values method, of class FuelType.
     */
    @Test
    public void testValues() {
        assertEquals(3, FuelType.values().length);
        assertEquals(FuelType.Petrol, FuelType.valueOf("Petrol"));
        assertEquals(FuelType.Disel, FuelType.valueOf("Disel"));
        assertEquals(FuelType.Hybrid, FuelType.valueOf("Hybrid"));
    }  }

  
  

