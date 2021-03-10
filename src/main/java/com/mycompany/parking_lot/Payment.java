/*
    Author: MattYeend
    Title: Payment
    Package: Parking_lot
    Date: 10/03/2021
    Version: 1.0
*/

package com.mycompany.parking_lot;

/**
 *
 * @author matty
 */

public class Payment{

    float HourAmount = 30;
    float TotalAmountForHour = 0;
    float TotalAmountForMinute = 0;

    public float TotalAmount(int Hour, int Minute){
        TotalAmountForHour = Hour * HourAmount;
        if (Minute < 60 && Minute >= 30) {
            TotalAmountForMinute = 20;
        }
        else if(Minute < 30 && Minute >= 15){
            TotalAmountForMinute = 15;
        }
        else if(Minute < 15 && Minute >= 1){
            TotalAmountForMinute = 10;
        }

        return (TotalAmountForHour+TotalAmountForMinute);
    }

}