package qualitycars;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Model.CarModel;
import Model.Customer;
import Model.IndividualCar;
import Model.RentalRecord;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class CarRentalSystem {

    private ArrayList<Customer> customers;
    private ArrayList<RentalRecord> rentalRecords;
    private ArrayList<IndividualCar> individualCars;
    private CarModel carModels;

    public CarRentalSystem(ArrayList<Customer> customers, ArrayList<RentalRecord> rentalRecords) {
        this.customers = customers;
        this.rentalRecords = rentalRecords;
    }

    public CarRentalSystem(ArrayList<IndividualCar> individualCars, CarModel carModels) {
        this.individualCars = individualCars;
        this.carModels = carModels;
    }

    public CarRentalSystem(ArrayList<RentalRecord> rentalRecords) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<RentalRecord> getRentalRecords() {
        return rentalRecords;
    }

    public void setRentalRecords(ArrayList<RentalRecord> rentalRecords) {
        this.rentalRecords = rentalRecords;
    }

    public ArrayList<IndividualCar> getIndividualCars() {
        return individualCars;
    }

    public void setIndividualCars(ArrayList<IndividualCar> individualCars) {
        this.individualCars = individualCars;
    }

    public CarModel getCarModels() {
        return carModels;
    }

    public void setCarModels(CarModel carModels) {
        this.carModels = carModels;
    }

    public ArrayList<RentalRecord> getRentalRecordsBetweenDates(Date startDate, Date endDate) {
        ArrayList<RentalRecord> recordsBetweenDates = new ArrayList<>();

        for (RentalRecord record : rentalRecords) {
            Date rentalDate = record.getRentalDate();

            if (rentalDate.after(startDate) && rentalDate.before(endDate)) {
                recordsBetweenDates.add(record);
            }
        }

        return recordsBetweenDates;
    }
}
