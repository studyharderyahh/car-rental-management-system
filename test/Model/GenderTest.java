/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;


/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class GenderTest {

    public GenderTest() {
    }

    /**
     * Test of values method, of class Gender.
     */
    @Test
    public void testGenderValues() {
        // Test the values() method
        Gender[] genders = Gender.values();
        assertEquals(3, genders.length);  // Assuming you have three values: MALE, FEMALE, OTHERS

        // Test individual enum values
        assertEquals(Gender.MALE, Gender.valueOf("MALE"));
        assertEquals(Gender.FEMALE, Gender.valueOf("FEMALE"));
        assertEquals(Gender.OTHERS, Gender.valueOf("OTHERS"));
    }

}
