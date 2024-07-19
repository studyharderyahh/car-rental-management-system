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
public class PersonTest {
    
    public PersonTest() {
    }

    /**
     * Test of getPersonID method, of class Person.
     */
    @Test
    public void testPerson() {
        // Create a sample Date for testing
        Date sampleDate = new Date();

        // Create a sample Person
        Person person = new Person("ID123", "John Doe", Gender.MALE, sampleDate, "123 Main St", "555-1234");

        // Test getter methods
        assertEquals("ID123", person.getPersonID());
        assertEquals("John Doe", person.getName());
        assertEquals(Gender.MALE, person.getGender());
        assertEquals(sampleDate, person.getDateOfBirth());
        assertEquals("123 Main St", person.getAddress());
        assertEquals("555-1234", person.getPhone());

        // Test setter methods
        person.setPersonID("ID456");
        assertEquals("ID456", person.getPersonID());

        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName());

        Gender newGender = Gender.FEMALE;
        person.setGender(newGender);
        assertEquals(newGender, person.getGender());

        Date newDateOfBirth = new Date();
        person.setDateOfBirth(newDateOfBirth);
        assertEquals(newDateOfBirth, person.getDateOfBirth());

        person.setAddress("456 Side St");
        assertEquals("456 Side St", person.getAddress());

        person.setPhone("555-5678");
        assertEquals("555-5678", person.getPhone());
    }
    
}
