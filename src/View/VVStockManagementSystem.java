/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.CarModel;
import Model.CarModel;
import Model.IndividualCar;
import Model.IndividualCar;
import Model.RentalRecord;
import Model.RentalRecord;
import static Model.StatusoftheCar.InShop;
import static Model.StatusoftheCar.RentedOut;
import static Model.StatusoftheCar.UnderManintance;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author
 */
public class VVStockManagementSystem {

    ArrayList<IndividualCar> indcar;
    ArrayList<CarModel> carmodel;
    ArrayList<RentalRecord> rentalRecord;

    public VVStockManagementSystem() {
        Date duedate = new Date("29-11-2023");
        Date daterent = new Date("25-11-2023");
        Date wof = new Date("15-09-2025");

        indcar = new ArrayList<>();
        indcar.add(new IndividualCar("ABC123", "Red", 12000, InShop));
        indcar.add(new IndividualCar("XYZ789", "Blue", 8000, RentedOut));
        indcar.add(new IndividualCar("LMN456", "Black", 3000, UnderManintance));
        indcar.add(new IndividualCar("PQR789", "White", 2000, RentedOut));
        indcar.add(new IndividualCar("DEF321", "Silver", 1000, InShop));
        indcar.add(new IndividualCar("GHI654", "Green", 90000, UnderManintance));
        indcar.add(new IndividualCar("JKL987", "Yellow", 5000, InShop));
        indcar.add(new IndividualCar("MNO012", "Purple", 6700, UnderManintance));

    }

    public IndividualCar searchRegisterationNumber(String registerationNum) {

        IndividualCar found = null;
        for (IndividualCar ic : indcar) {
            if (ic.getRegisterationNumber().equals(registerationNum)) {
                found = ic;
                break;
            }
        }
        return found;
    }

    public CarModel CarModels() {
        carmodel = new ArrayList<>();
        carmodel.add(new CarModel(" Camry", "Toyota", "Petrol", 5, 25000));
        carmodel.add(new CarModel(" Accord", "Honda", "Hybrid", 5, 28000));
        carmodel.add(new CarModel(" Explorer", "Ford", "Gasoline", 5, 35000));
        carmodel.add(new CarModel(" Model 3", "Tesla", "Electric", 5, 50000));
        carmodel.add(new CarModel(" Silverado", "Chevrolet", "Diesel", 5, 40000));
        return null;

    }

}
