/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author himani.walia
 */
public class ReturnRecord {
    private String CustomerID,CustomerName,CarRegisterationNo;
    private StatusoftheCar status;

    public ReturnRecord(String CustomerID, String CustomerName, String CarRegisterationNo, StatusoftheCar status) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CarRegisterationNo = CarRegisterationNo;
        this.status = status;
    }

    public ReturnRecord() {
    }
    

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCarRegisterationNo() {
        return CarRegisterationNo;
    }

    public void setCarRegisterationNo(String CarRegisterationNo) {
        this.CarRegisterationNo = CarRegisterationNo;
    }

    public StatusoftheCar getStatus() {
        return status;
    }

    public void setStatus(StatusoftheCar status) {
        this.status = status;
    }
    
    
}
