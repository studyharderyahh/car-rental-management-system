/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import Model.Customer;
import Model.Employee;
import Model.RentalRecord;
import java.util.ArrayList;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class EmployeeAndCustomer {

    // private ArrayList<Car> cars;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;
    private ArrayList<RentalRecord> rentalRecords;

    public EmployeeAndCustomer() {

        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentalRecords = new ArrayList<>();

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//          Moved the initilizing data to Login Form 
//          to prevent the data repeating resign a the object will be created multiple times
//        Date date1 = null;
//        Date date2 = null;
//        Date date3 = null;
//        Date date4 = null;
//        Date date5 = null;
//        Date date6 = null;
//        Date date7 = null;
//        Date date8 = null;
//        Date date9 = null;
//        Date date10 = null;
//        Date date11 = null;
//        Date date12 = null;
//        Date date13 = null;
//        Date date14 = null;
//
//        try {
//            date1 = dateFormat.parse("1989-09-12");
//            date2 = dateFormat.parse("1978-03-25");
//            date3 = dateFormat.parse("2025-08-14");
//            date4 = dateFormat.parse("1889-09-12");
//            date5 = dateFormat.parse("1899-10-22");
//            date6 = dateFormat.parse("1887-03-08");
//            date7 = dateFormat.parse("1897-06-27");
//            date8 = dateFormat.parse("1977-03-11");
//            date9 = dateFormat.parse("1997-06-27");
//            date10 = dateFormat.parse("1977-06-18");
//            date11 = dateFormat.parse("2027-08-24");
//            date12 = dateFormat.parse("2025-11-05");
//            date13 = dateFormat.parse("2026-08-14");
//            date14 = dateFormat.parse("2028-07-11");
//        } catch (ParseException e) {
//            e.printStackTrace(); // Handle the parsing exception
//        }
//
//        // Add these instances to the lists
//        employees.add(new Employee("01", "adtesting", "123456", Role.ADMIN, "A01", "Azalea", Gender.FEMALE, date1, "Auckland CBD", "2345678901"));
//        employees.add(new Employee("03", "stafftesting", "123456", Role.STAFF, "A02", "Jerry", Gender.MALE, date2, "Manukau Auckland", "28765433"));
//        employees.add(new Employee("05", "david123", "david123", Role.STAFF, "A03", "David", Gender.MALE, date4, "Takanini Auckland", "234565961"));
//        employees.add(new Employee("04", "linda123", "linda123", Role.ADMIN, "A04", "Linda", Gender.FEMALE, date5, "Manurewa Auckland", "2348469301"));
//    
//        customers.add(new Customer("0951843", "restriced", date3, "C01", "Bolton", Gender.MALE, date6, "123 Street Papakura Auckland", "0268739465"));
//        customers.add(new Customer("220345", "Full License", date11, "C02", "Eden", Gender.MALE, date7, "123 Street Manurewa Auckland", "24674527472"));
//        customers.add(new Customer("220355", "Restrict", date12, "C03", "Eve", Gender.FEMALE, date8, "123 Street Manukau Auckland", "24234567872"));
//        customers.add(new Customer("220365", "Full License", date13, "C04", "Joshua", Gender.MALE, date9, "123 Street Otahuhu Auckland", "28653567832"));
//        customers.add(new Customer("220375", "Restrict", date14, "C05", "Marry", Gender.FEMALE, date10, "123 Street Taruanga Auckland", "28763456789"));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Employee searchEmployeeByID(String id) {
        Employee found = null;
        for (Employee e : employees) {
            if (e.getPersonID().equals(id)) {
                found = e;
                break;
            }
        }
        return found;
    }

    public Employee searchEmployeeByUsername(String username) {
        username = username.toLowerCase();
        Employee found = null;
        for (Employee e : employees) {
            if (e.getUsername().equals(username)) {
                found = e;
                break;
            }
        }
        return found;
    }

    public String addEmployee(Employee employee) {
        Employee emp = searchEmployeeByID(employee.getPersonID());
        if (emp == null) {
            employees.add(employee);
            System.out.print("DEBUG: Employee added successfully!");
            return "Employee added successfully!";
        } else {
            System.out.print("DEBUG: Sorry, this ID is not available to be used.");
            return "Sorry, this ID is not available to be used.";
        }
    }

    public Customer searchCustomerByID(String id) {
        Customer cust = null;
        for (Customer c : customers) {
            if (c.getPersonID().equals(id)) {
                cust = c;
                break;
            }
        }
        return cust;
        // found the id --> return the id in the textfield
    }

    public String addCustomer(Customer customer) {
        Customer cust = searchCustomerByID(customer.getPersonID());
        System.out.print("DEBUG: Customer details - " + customer.customerToString() + "\n");

        if (cust == null) {
            customers.add(customer);
            System.out.print("DEBUG: Customer added successfully!");
            return "Customer added successfully!";
        } else {
            System.out.print("DEBUG: Sorry, this ID is not available to be used.");
            return "Sorry, this ID is not available to be used.";
        }
    }

    public boolean isUsernameExists(String username) {
        for (Employee e : employees) {
            if (e.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean login(String username, String password) {
        boolean found = false;
        for (Employee e : employees) {

            /* *  * * * * * * Just for testing purpose * * * * * * * * * *
          * System.out.println("Staff username: " + s.getUsername()); *
          * System.out.println("Staff password: " + s.getPassword()); *
          * * * * * * * * * *  * * * * * * * * * * * * * * * *  * * * */
            if (e.getUsername().equals(username)
                    && e.getPassword().equals(password)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public String getEmployeeNameByUsername(String username) {
        for (Employee e : employees) {
            if (e.getUsername().equals(username)) {
                return e.getName();
            }
        }
        return null; // return null if no matching username is found
    }

    // For the testing purpose
    public void printEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getPersonID());
            System.out.println("Name: " + employee.getName());
            System.out.println("Gender: " + employee.getGender());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Birth Date: " + employee.getDateOfBirth());
            System.out.println("Phone: " + employee.getPhone());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Username: " + employee.getUsername());
            System.out.println("Password: " + employee.getGender());
            System.out.println("Phone Extension Number: " + employee.getPhoneExtensionNumber());

            System.out.println("-----------------------------");
        }
    }

    public void printCustomerDetails() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getPersonID());
            System.out.println("Name: " + customer.getName());
            System.out.println("Gender: " + customer.getGender());
            System.out.println("Birth Date: " + customer.getDateOfBirth());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("License Number: " + customer.getLicenseNumber());
            System.out.println("License Type: " + customer.getLicenseType());
            System.out.println("License Expire date: " + customer.getLicenseExpiryDate());

            System.out.println("----------------------------");
        }
    }

    // This method removes an employee based on their person ID
    public void removeEmployeeById(String id) {
        Employee employeeToRemove = null;
        // Find the employee with the specified ID
        for (Employee e : employees) {
            if (e.getPersonID().equals(id)) {
                employeeToRemove = e;
                break;
            }
        }
        // Remove the employee if found
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        }
    }

    public void removeCustomerById(String id) {
        Customer customerToRemove = null;

        // Find the customer with the specified ID
        for (Customer customer : customers) {
            if (customer.getPersonID().equals(id)) {
                customerToRemove = customer;
                break;
            }
        }
        // Remove the customer if found
        if (customerToRemove != null) {
            customers.remove(customerToRemove);
            System.out.println("Customer removed successfully!");
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }

}
