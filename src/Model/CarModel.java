/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author himani.walia
 */
public class CarModel {
   
    private String model,manufacturerName;
    private String fuelType;
    private int seats;
    private float engineSize;
    

    public CarModel(String model, String manufacturerName, String fuelType, int seats, float engineSize)
    {
        this.model = model;
        this.manufacturerName = manufacturerName;
        this.fuelType = fuelType;
        this.seats = seats;
        this.engineSize = engineSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    
    
    
}
