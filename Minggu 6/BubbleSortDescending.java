/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_6;

/**
 *
 * @author Bayu Firdaus
 */
public class BubbleSortDescending {
    
    static void BubbleSortD(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    
                    //Swap Elements
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    swap = true;
                    if(swap) {
                        swap_count++;
                    }
                }
            }
        }
        System.out.println("Jumlah Perbandingan : " + swap_count);
    }
    
    public static void main(String[] args) {
        int[] arr = {4,30,20,2,25,212,5,};
        System.out.println("Array Sebelum Bubble Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println("");
            BubbleSortD(arr);
            //Sorting Array Elements Using Bubble Sort
            
            System.out.println("Array Sesudah Bubble Sort Descending : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
    }
    
}
