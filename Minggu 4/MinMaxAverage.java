/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_4;

import java.util.Scanner;

/**
 *
 * @author Bayu Firdaus
 */
public class MinMaxAverage {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nilai_input = 0,jml_bilangan = 0, min = 0, max = 0;
        double average = 0, rata = 0;
        
        System.out.print("Masukkan Banyaknya Data : ");
        jml_bilangan = input.nextInt();
        
        System.out.print("Masukkan Data Nilai ke 1 : ");
        nilai_input = input.nextInt();
        
        min = nilai_input;
        max = nilai_input;
        average = nilai_input;
        
        for(int i = 2; i <= jml_bilangan; i++){
        System.out.print("Masukkan Data Nilai ke "+i+" : ");
        nilai_input = input.nextInt();
        average += nilai_input;
        
        
    //penyeleksian untuk mendapatkan nilai minimal
        if(nilai_input < min){
            max = min;
            min = nilai_input;
        }
        else if (nilai_input > max){
            max = nilai_input;
        }
        
    }
    //proses perhitungan rata-rata dan cetak hasil minimal
        rata = average/jml_bilangan;
        
        System.out.println("Nilai Minimum : "+ min);
        System.out.println("Nilai Maksimum : "+ max);
        System.out.println("Nilai Rata-rata  : "+ rata);
    }
            
}

