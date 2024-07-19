/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.*;
import static Model.StatusoftheCar.InShop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author himani.walia
 */
public class RentCartoCustomer {
    private String registerationNum,Colour,CustomerID,CustomerName , CustomerPhone,CustomerAddress;
    private Date daterented,duedate;
    private float rentalamount;
    private StatusoftheCar status;
    private BodyTypeofCar typeofcar;
    ArrayList<RentCartoCustomer> customerList = new ArrayList<>();

      

    public RentCartoCustomer() {
    }
        

    public RentCartoCustomer(String CustomerID, String CustomerName, String CustomerPhone, String CustomerAddress) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerPhone = CustomerPhone;
        this.CustomerAddress = CustomerAddress;
    }


    public RentCartoCustomer(String registerationNum, String Colour, Date daterented, Date duedate, float rentalamount, StatusoftheCar status, BodyTypeofCar typeofcar) {
        this.registerationNum = registerationNum;
        this.Colour = Colour;
        this.daterented = daterented;
        this.duedate = duedate;
        this.rentalamount = rentalamount;
        this.status = status;
        this.typeofcar = typeofcar;
    }

    public String getRegisterationNum() {
        return registerationNum;
    }

    public void setRegisterationNum(String registerationNum) {
        this.registerationNum = registerationNum;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public Date getDaterented() {
        return daterented;
    }

    public void setDaterented(Date daterented) {
        this.daterented = daterented;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public float getRentalamount() {
        return rentalamount;
    }

    public void setRentalamount(float rentalamount) {
        this.rentalamount = rentalamount;
    }

    public StatusoftheCar getStatus() {
        return status;
    }

    public void setStatus(StatusoftheCar status) {
        this.status = status;
    }

    public BodyTypeofCar getTypeofcar() {
        return typeofcar;
    }

    public void setTypeofcar(BodyTypeofCar typeofcar) {
        this.typeofcar = typeofcar;
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

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    public void cardetails()
    {
        RentCartoCustomer car1 = new RentCartoCustomer("ABC123", "Blue", new Date(), new Date(), 100, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
        RentCartoCustomer car2 = new RentCartoCustomer("XYZ456", "Red", new Date(), new Date(), 120, StatusoftheCar.InShop, BodyTypeofCar.SUV);
RentCartoCustomer car3 = new RentCartoCustomer("DEF789", "Green", new Date(), new Date(), 90, StatusoftheCar.InShop, BodyTypeofCar.HATCHBACK);
RentCartoCustomer car4 = new RentCartoCustomer("GHI012", "Black", new Date(), new Date(), 110, StatusoftheCar.InShop, BodyTypeofCar.VAN);
RentCartoCustomer car5 = new RentCartoCustomer("JKL345", "Silver", new Date(), new Date(), 95, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
RentCartoCustomer car6 = new RentCartoCustomer("MNO678", "White", new Date(), new Date(), 130, StatusoftheCar.InShop, BodyTypeofCar.SUV);
RentCartoCustomer car7 = new RentCartoCustomer("PQR901", "Yellow", new Date(), new Date(), 105, StatusoftheCar.InShop, BodyTypeofCar.HATCHBACK);
RentCartoCustomer car8 = new RentCartoCustomer("STU234", "Gray", new Date(), new Date(), 115, StatusoftheCar.InShop, BodyTypeofCar.VAN);
RentCartoCustomer car9 = new RentCartoCustomer("VWX567", "Brown", new Date(), new Date(), 98, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
RentCartoCustomer car10 = new RentCartoCustomer("YZA890", "Purple", new Date(), new Date(), 125, StatusoftheCar.InShop, BodyTypeofCar.SUV);

        
    }
    public void CustomerDetails(){
        RentCartoCustomer customer1 = new RentCartoCustomer("CUST001", "John Doe", "+1234567890", "123 Main St, Cityville");
RentCartoCustomer customer2 = new RentCartoCustomer("CUST002", "Jane Smith", "+9876543210", "456 Oak St, Townsville");
RentCartoCustomer customer3 = new RentCartoCustomer("CUST003", "Bob Johnson", "+1112223333", "789 Pine St, Villagetown");
RentCartoCustomer customer4 = new RentCartoCustomer("CUST004", "Alice Williams", "+4445556666", "321 Elm St, Hamlet");
RentCartoCustomer customer5 = new RentCartoCustomer("CUST005", "Charlie Brown", "+7778889999", "654 Birch St, Countryside");
RentCartoCustomer customer6 = new RentCartoCustomer("CUST006", "Eva Davis", "+3334445555", "987 Maple St, Riverside");
RentCartoCustomer customer7 = new RentCartoCustomer("CUST007", "Michael White", "+6667778888", "101 Cedar St, Lakeside");
RentCartoCustomer customer8 = new RentCartoCustomer("CUST008", "Sophia Miller", "+2223334444", "202 Willow St, Mountainside");
RentCartoCustomer customer9 = new RentCartoCustomer("CUST009", "Ryan Wilson", "+5556667777", "303 Rose St, Hilltop");
RentCartoCustomer customer10 = new RentCartoCustomer("CUST010", "Olivia Davis", "+8889990000", "404 Sun St, Seaside");
customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);
        customerList.add(customer7);
        customerList.add(customer8);
        customerList.add(customer9);
        customerList.add(customer10);
        
    }
    
}

