/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class Employee extends Person
{
    private String phoneExtensionNumber;
    private String username;
    private String password;
    private Role role;

    public Employee(String phoneExtensionNumber, String username, String password, Role role, String PersonID, String name, Gender gender, Date dateOfBirth, String address, String phone) {
        super(PersonID, name, gender, dateOfBirth, address, phone);
        this.phoneExtensionNumber = phoneExtensionNumber;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getPhoneExtensionNumber() {
        return phoneExtensionNumber;
    }

    public void setPhoneExtensionNumber(String phoneExtensionNumber) {
        this.phoneExtensionNumber = phoneExtensionNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    // Need the setRole method in Update Form
    public void setRole(Role role) {
        this.role = role;
    }
    
    // A logger for back-end users to know
    // Acctually for me to do the debug
    public String employeeToString() {
        
        String empStr = this.getPersonID() + "," + 
                         this.getName() + "," + 
                         this.getPhone()  + "," +
                         this.getAddress();
        return empStr;
    }
    
}
