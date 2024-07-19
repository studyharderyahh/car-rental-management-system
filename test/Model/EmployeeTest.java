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
public class EmployeeTest {

    public EmployeeTest() {
    }

    /**
     * Test of getPhoneExtensionNumber method, of class Employee.
     */
    @Test
    public void testEmployee() {
        // Create a sample Date for testing
        Date sampleDate = new Date();

        // Create a sample Employee
        Employee employee = new Employee("123", "john_doe", "password123", Role.ADMIN, "ID456", "John Doe", Gender.MALE, sampleDate, "456 Main St", "555-5678");

        // Test getter methods
        assertEquals("123", employee.getPhoneExtensionNumber());
        assertEquals("john_doe", employee.getUsername());
        assertEquals("password123", employee.getPassword());
        assertEquals(Role.ADMIN, employee.getRole());
        assertEquals("ID456", employee.getPersonID());
        assertEquals("John Doe", employee.getName());
        assertEquals(Gender.MALE, employee.getGender());
        assertEquals(sampleDate, employee.getDateOfBirth());
        assertEquals("456 Main St", employee.getAddress());
        assertEquals("555-5678", employee.getPhone());

        // Test setter methods
        employee.setPhoneExtensionNumber("456");
        assertEquals("456", employee.getPhoneExtensionNumber());

        employee.setUsername("jane_doe");
        assertEquals("jane_doe", employee.getUsername());

        employee.setPassword("newPassword");
        assertEquals("newPassword", employee.getPassword());

        Role newRole = Role.STAFF;
        employee.setRole(newRole);
        assertEquals(newRole, employee.getRole());

        // Test employeeToString method
        String expectedString = "ID456,John Doe,555-5678,456 Main St";
        assertEquals(expectedString, employee.employeeToString());
    }

    @Test
    public void testSetRole() {
        // Create an employee
        Employee employee = new Employee("123", "john_doe", "password123", Role.ADMIN, "ID456", "John Doe", Gender.MALE, new Date(), "456 Main St", "555-5678");

        // Test setRole method
        Role newRole = Role.STAFF;
        employee.setRole(newRole);
        assertEquals(newRole, employee.getRole());
    }

    @Test
    public void testEmployeeToString() {
        // Create an employee
        Employee employee = new Employee("123", "john_doe", "password123", Role.ADMIN, "ID456", "John Doe", Gender.MALE, new Date(), "456 Main St", "555-5678");

        // Test employeeToString method
        String expectedString = "ID456,John Doe,555-5678,456 Main St";
        assertEquals(expectedString, employee.employeeToString());
    }

}
