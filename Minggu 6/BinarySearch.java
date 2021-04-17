/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_6;

import java.util.Arrays;

/**
 *
 * @author Bayu Firdaus
 */
public class BinarySearch {
    
    public static void binarySearch(int arr[], int first, int last, int key) {
        int n = (first = last) / 2;
        while (first <= last) {
            if (arr[n] < key) {
                first = n + 1;
            }
            else if (arr[n] == key) {
                System.out.println("Elements Is Found at Index : " + n);
                break;
            }
            else {
                last = n - 1;
            }
            n = (first + last) / 2;         
        }
        if (first > last) {
            System.out.println("Element Is Not Found : ");
        }
    }
    
    public static void main(String[] args) {
        int[] angka = {1,3,5,7,9,11,13,15,17};
        Arrays.sort(angka);
        int target = 4;
        int last = angka.length - 1;
        binarySearch(angka, 0, last, target);
    }
    
}
