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
public class BubbleSortAscending {
    
    static void BubbleSortA(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    
                    //Swap Elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
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
        System.out.println("Array Sebelum Bubble Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println("");
            BubbleSortA(arr);
            //Sorting Array Elements Using Bubble Sort
            
            System.out.println("Array Sesudah Bubble Sort Ascending : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
    }
    
}
