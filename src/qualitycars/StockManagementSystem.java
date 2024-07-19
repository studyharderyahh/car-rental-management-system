/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import Model.CarModel;
import Model.IndividualCar;
import java.util.ArrayList;
import static Model.StatusoftheCar.InShop;
import static Model.StatusoftheCar.RentedOut;
import static Model.StatusoftheCar.UnderManintance;
import java.util.Date;


/**
 *
 * @author himani.walia
 */
public class StockManagementSystem {

    ArrayList<IndividualCar> indcar = new ArrayList<>();
    ArrayList<CarModel> carmodel = new ArrayList<>();

    public StockManagementSystem() {
      
        carmodel.add(new CarModel(" Camry", "Toyota", "Petrol", 5, 25000));
        carmodel.add(new CarModel(" Accord", "Honda", "Hybrid", 5, 28000));
        carmodel.add(new CarModel(" Explorer", "Ford", "Gasoline", 5, 35000));
        carmodel.add(new CarModel(" Model 3", "Tesla", "Electric", 5, 50000));
        carmodel.add(new CarModel(" Silverado", "Chevrolet", "Diesel", 5, 40000));

        indcar.add(new IndividualCar("ABC123", "Red", 12000, InShop));
        indcar.add(new IndividualCar("XYZ789", "Blue", 8000, RentedOut));
        indcar.add(new IndividualCar("LMN456", "Black", 3000, UnderManintance));
        indcar.add(new IndividualCar("PQR789", "White", 2000, RentedOut));
        indcar.add(new IndividualCar("DEF321", "Silver", 1000, InShop));
        indcar.add(new IndividualCar("GHI654", "Green", 90000, UnderManintance));
        indcar.add(new IndividualCar("JKL987", "Yellow", 5000, InShop));
        indcar.add(new IndividualCar("MNO012", "Purple", 6700, UnderManintance));

    }
    public String registerationNum(){
    String regi = null;
        for (IndividualCar ic : indcar) 
        {
           regi= ic.getRegisterationNumber();
            
           
              
            }
        return regi;
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

}
