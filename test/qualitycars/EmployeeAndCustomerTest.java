/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import Model.Customer;
import Model.Employee;
import Model.Gender;
import Model.Role;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class EmployeeAndCustomerTest {

    private EmployeeAndCustomer employeeAndCustomer = new EmployeeAndCustomer();

    @Test
    public void testAddEmployee() {
        Employee testEmployee = new Employee("E01", "testUser", "testPass", Role.STAFF,
                "A01", "Test Employee", Gender.MALE, new Date(), "Test Address", "1234567890");

        String result = employeeAndCustomer.addEmployee(testEmployee);
        assertEquals("Employee added successfully!", result);

        // Test if the employee is in the list
        assertTrue(employeeAndCustomer.getEmployees().contains(testEmployee));
    }

    @Test
    public void testSearchEmployeeByID() {
        // Add a test employee
        Employee testEmployee = new Employee("1234", "testUser2", "testPass2", Role.ADMIN,
                "A02", "Test Employee 2", Gender.FEMALE, new Date(), "Test Address 2", "9876543210");
        employeeAndCustomer.addEmployee(testEmployee);

        // Search for the employee by ID
        Employee result = employeeAndCustomer.searchEmployeeByID("A02");

        // Check if the correct employee is returned
        assertNotNull(result);
        assertEquals(testEmployee, result);
    }

    @Test
    public void testRemoveEmployeeById() {
        // Add a test employee
        Employee testEmployee = new Employee("2345", "testUser3", "testPass3", Role.STAFF,
                "E03", "Test Employee 3", Gender.MALE, new Date(), "Test Address 3", "1122334455");
        employeeAndCustomer.addEmployee(testEmployee);

        // Remove the employee by ID
        employeeAndCustomer.removeEmployeeById("E03");

        // Check if the employee is removed
        assertFalse(employeeAndCustomer.getEmployees().contains(testEmployee));
    }

    @Test
    public void testAddCustomer() {
        Customer testCustomer = new Customer("2345677654", "Full License", new Date(), "C01",
                "Test Customer", Gender.FEMALE, new Date(), "Test Address", "9876543210");

        String result = employeeAndCustomer.addCustomer(testCustomer);
        assertEquals("Customer added successfully!", result);

        // Test if the customer is in the list
        assertTrue(employeeAndCustomer.getCustomers().contains(testCustomer));
    }

    @Test
    public void testSearchCustomerByID() {
        // Add a test customer
        Customer testCustomer = new Customer("235422", "Restrict", new Date(), "C02",
                "Test Customer 2", Gender.MALE, new Date(), "Test Address 2", "1122334455");
        employeeAndCustomer.addCustomer(testCustomer);

        // Search for the customer by ID
        Customer result = employeeAndCustomer.searchCustomerByID("C02");

        // Check if the correct customer is returned
        assertNotNull(result);
        assertEquals(testCustomer, result);
    }

    @Test
    public void testRemoveCustomerById() {
        // Add a test customer
        Customer testCustomer = new Customer("223344", "Full License", new Date(), "C03",
                "Test Customer 3", Gender.FEMALE, new Date(), "Test Address 3", "9988776655");
        employeeAndCustomer.addCustomer(testCustomer);

        // Remove the customer by ID
        employeeAndCustomer.removeCustomerById("C03");

        // Check if the customer is removed
        assertFalse(employeeAndCustomer.getCustomers().contains(testCustomer));
    }

    @Test
    public void testLogin() {
        // Add a test employee
        Employee testEmployee = new Employee("E05", "testUser5", "testPass5", Role.ADMIN,
                "A05", "Test Employee 5", Gender.FEMALE, new Date(), "Test Address 5", "9988776655");
        employeeAndCustomer.addEmployee(testEmployee);

        // Check if login with correct credentials returns true
        assertTrue(employeeAndCustomer.login("testUser5", "testPass5"));

        // Check if login with incorrect credentials returns false
        assertFalse(employeeAndCustomer.login("testUser5", "incorrectPassword"));
    }

}
