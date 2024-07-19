/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author himani.walia
 */
public class IndividualCarTest {
    
    public IndividualCarTest() {
    }

    /**
     * Test of getRegisterationNumber method, of class IndividualCar.
     */
      @Test
    public void testRegistrationNumber() {
        // Create an IndividualCar object with a registration number
        String registrationNumber = "ABC123";
        IndividualCar car = new IndividualCar("ABC123", new Date(), "Red",
                new Date(), new Date(), new Date(), 50.0f,
                BodyTypeofCar.SEDAN, StatusoftheCar.InShop, new ArrayList<>());

        // Check if the registration number is set correctly
        assertEquals(registrationNumber, car.getRegisterationNumber());
    }


 

    
}
