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
public class Customer extends Person 
{
    private String licenseNumber;
    // Was thinking to put License Type as Enum class
    private String licenseType;
    private Date licenseExpiryDate;

    public Customer(String licenseNumber, String licenseType, Date licenseExpiryDate, String PersonID, String name, Gender gender, Date dateOfBirth, String address, String phone) {
        super(PersonID, name, gender , dateOfBirth, address, phone);
        this.licenseNumber = licenseNumber;
        this.licenseType = licenseType;
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
    
    
    public String customerToString() {
        
        String custStr = this.getPersonID() + "," + 
                         this.getName() + "," + 
                         this.getPhone()  + "," +
                         this.getAddress();
        return custStr;
    }
    
    
}
