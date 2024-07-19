/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import Model.CarModel;
import Model.Customer;
import Model.IndividualCar;
import Model.RentalRecord;
import Model.StatusoftheCar;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author himani.walia
 */
public class CarRentalSystemIT {
    
    private CarRentalSystem carRentalSystem;

    @Before
    public void setUp() {
        carRentalSystem = new CarRentalSystem(new ArrayList<>(), new ArrayList<>());
    }



    @Test
    public void testSetAndGetIndividualCars() {
        // Create a list of individual cars
        ArrayList<IndividualCar> individualCars = new ArrayList<>();
        individualCars.add(new IndividualCar("ABC123", "Blue", 12000, StatusoftheCar.InShop));

        carRentalSystem.setIndividualCars(individualCars);
        assertEquals(individualCars, carRentalSystem.getIndividualCars());
    }

    @Test
    public void testSetAndGetCarModels() {
        // Create a car model
        CarModel carModel = new CarModel("Camry", "Toyota", "Petrol", 5, 25000);

   
        carRentalSystem.setCarModels(carModel);
        assertEquals(carModel, carRentalSystem.getCarModels());
    }
    
}
