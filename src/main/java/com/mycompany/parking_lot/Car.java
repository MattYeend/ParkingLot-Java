/*
    Author: MattYeend
    Title: Car
    Package: Parking_lot
    Date: 10/03/2021
    Version: 1.0
*/

package com.mycompany.parking_lot;

/**
 *
 * @author matty
 */

public class Car {
    public String NumberPlate;
    public String CarColor;
    public String CarType;
    
    public String getNumberPlate() {
        return NumberPlate;
    }
    
    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }
    
    public String getCarColor() {
        return CarColor;
    }
    
    public void setCarColor(String CarColor) {
        this.CarColor = CarColor;
    }
    
    public String getCarType() {
        return CarType;
    }
    
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }
}