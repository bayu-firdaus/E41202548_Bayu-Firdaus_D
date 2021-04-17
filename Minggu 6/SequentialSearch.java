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
public class SequentialSearch {
    
    static void sequentialSearch(int[] arr, int search) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
            }
        }
        System.out.println("Data Berada Pada Index : " + index);
    }
    
    public static void main(String[] args) {
        int[] angka = {1,3,5,7,9,11,13,15,17};
        Arrays.sort(angka);
        sequentialSearch(angka, 13);
    }
    
}
