/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author himani.walia
 */
public class IndividualCar {
    private String registerationNumber,colour;
    Date dateRented,dueDate,yearofManufacturer,wof;
    private float rentalAmountpd;
    private BodyTypeofCar typeofCar;
    private StatusoftheCar status;
    private ArrayList <CarModel> carModel;

    public IndividualCar(String registerationNumber, Date wof, String colour, Date yearofManufacturer, Date dateRented, Date dueDate, float rentalAmountpd, BodyTypeofCar typeofCar, StatusoftheCar status, ArrayList<CarModel> carModel) 
    {
        this.registerationNumber = registerationNumber;
        this.wof = wof;
        this.colour = colour;
        this.yearofManufacturer = yearofManufacturer;
        this.dateRented = dateRented;
        this.dueDate = dueDate;
        this.rentalAmountpd = rentalAmountpd;
        this.typeofCar = typeofCar;
        this.status = status;
        this.carModel = carModel;
    }

    public IndividualCar(String registerationNumber, String colour, float rentalAmountpd,StatusoftheCar status) {
        this.registerationNumber = registerationNumber;
        this.colour = colour;
        this.rentalAmountpd = rentalAmountpd;
        this.status=status;
      
    }

    public IndividualCar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public IndividualCar(String string, String blue, int i, StatusoftheCar statusoftheCar, Date date, Date date0, int i0, BodyTypeofCar bodyTypeofCar, ArrayList<Object> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    public Date getWOF() {
        return wof;
    }

    public void setWOF(Date WOF) {
        this.wof = WOF;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Date getYearofManufacturer() {
        return yearofManufacturer;
    }

    public void setYearofManufacturer(Date YearofManufacturer) {
        this.yearofManufacturer = YearofManufacturer;
    }

    public Date getDateRented() {
        return dateRented;
    }

    public void setDateRented(Date dateRented) {
        this.dateRented = dateRented;
    }

    public Date getDueDate() {
        
        return dueDate;
    }

    public void setDueDate(Date DueDate) {
        this.dueDate = DueDate;
    }

    public float getRentalAmountpd() {
        return rentalAmountpd;
    }

    public void setRentalAmountpd(float rentalAmountpd) {
        this.rentalAmountpd = rentalAmountpd;
    }

    public BodyTypeofCar getTypeofCar() {
        return typeofCar;
    }

    public void setTypeofCar(BodyTypeofCar typeofCar) {
        this.typeofCar = typeofCar;
    }

    public StatusoftheCar getStatus() {
        return status;
    }

    public void setStatus(StatusoftheCar status) {
        this.status = status;
    }

    public ArrayList <CarModel> getCarModel() {
        return carModel;
    }

    public void setCarModel(ArrayList <CarModel> carModel) {
        this.carModel = carModel;
    }
}

    