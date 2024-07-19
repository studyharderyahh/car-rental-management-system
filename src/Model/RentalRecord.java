package Model;


import java.util.Date;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */

public class RentalRecord {

    private Date rentalDate;
    private Date returnDate;
    private Customer customer;
    private IndividualCar rentedCars;
    private CarModel carmodel;

    public RentalRecord(Customer customer, IndividualCar rentedCars) {
        this.customer = customer;
        this.rentedCars = rentedCars;
    }

    // For the task: c.	Display information of new customers who rented cars between two selected dates 
    public RentalRecord(Date rentalDate, Date returnDate, Customer customer, IndividualCar rentedCars, CarModel carmodel) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.rentedCars = rentedCars;
        this.carmodel = carmodel;
    }

    public RentalRecord(Date rentalDate, Date returnDate, IndividualCar rentedCars, CarModel carmodel) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentedCars = rentedCars;
        this.carmodel = carmodel;
    }
    
    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public IndividualCar getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(IndividualCar rentedCars) {
        this.rentedCars = rentedCars;
    }

    public CarModel getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(CarModel carmodel) {
        this.carmodel = carmodel;
    }

}
