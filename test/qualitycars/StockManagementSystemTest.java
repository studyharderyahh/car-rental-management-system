/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import Model.IndividualCar;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author himani.walia
 */
public class StockManagementSystemTest {
    
    private StockManagementSystem stockSystem;

    @Before
    public void setUp() {
        stockSystem = new StockManagementSystem();
    }

    @Test
    public void testSearchRegisterationNumber() {
        // Test when the registration number is present
        String existingRegistrationNumber = "ABC123";
        IndividualCar foundCar = stockSystem.searchRegisterationNumber(existingRegistrationNumber);
        assertNotNull(foundCar);
        assertEquals(existingRegistrationNumber, foundCar.getRegisterationNumber());

        // Test when the registration number is not present
        String nonExistingRegistrationNumber = "NON123";
        IndividualCar nonExistingCar = stockSystem.searchRegisterationNumber(nonExistingRegistrationNumber);
        assertNull(nonExistingCar);
    }

    @Test
    public void testRegistrationNum() {
        // Test if registration number is returned
        String registrationNumber = stockSystem.registerationNum();
        assertNotNull(registrationNumber);
    }
    
}
