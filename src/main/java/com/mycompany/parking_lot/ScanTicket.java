/*
    Author: MattYeend
    Title: ScanTicket
    Package: Parking_lot
    Date: 10/03/2021
    Version: 1.0
*/

package com.mycompany.parking_lot;

/**
 *
 * @author matty
 */

public class ScanTicket{

    public int cheaknumber(String inputnumber, String storenumber){

        int size1 = inputnumber.length();
        int size2 = storenumber.length();
        if (size1 != size2){
            return 0;
        }
        else if(inputnumber.equals(storenumber)){
           return 1;
        }
        return 0;

    }

}