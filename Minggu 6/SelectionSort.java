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
public class SelectionSort {
    
   static void selectionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    
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
        int[] arr = {3,6,8,7,4,6,2};
        System.out.println("Array Sebelum Selection Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println("");
            selectionSort(arr);
            //Sorting Array Elements Using Bubble Sort
            
            System.out.println("Array Sesudah Selection Sort : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
    }
    
}
