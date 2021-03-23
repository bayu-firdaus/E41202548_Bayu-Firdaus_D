/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;

import java.util.Scanner;

/**
 *
 * @author Bayu Firdaus
 */
public class Random_Array {
    
    public static void main(String[] args) {
        //Membuat objek "input" yang merupakan inisialisasi dari Scanner
        Scanner input = new Scanner(System.in);
        int JumlahDeret = 0;
        
        System.out.print("Masukkan Jumlah Deret: ");
        
        //nextInt digunakan untuk membaca baris angka yang dinputkan user
        JumlahDeret = input.nextInt();
        
        int [] DeretArray = new int [JumlahDeret];
        
        for (int i = 0; i < JumlahDeret; i++) {
            //Math.random()*10 digunakan untuk menampilkan angka secara acak dengan batasan sampai angka 8
            DeretArray [i] = (int) (Math.random() * 8);
        }
        
        for (int j = 0; j < JumlahDeret; j++) {
            System.out.println(DeretArray [j] + "\t");
        }
    }
}
