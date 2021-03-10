/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matty
 */
public class ParkingSpot {
    int[] arr = new int[10];
    
    public int SpotNum() {
        int spot = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] == 0) {
                spot = i + 1;
                arr[i] = i + 1;
                break;
            }
        }
        return spot;
    }
    
    public int si() {
        int cheakspot = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] != 0) {
                return 1;
            }
            else if(arr[i] == 0) {
                cheakspot++;
            }
        }
        return cheakspot;
    }
    
    public void sipe() {
        System.out.print("\nSpot status: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void FreeSpot (int num) {
        arr[num - 1] = 0;
    }
}
