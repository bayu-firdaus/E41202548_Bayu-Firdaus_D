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
public class SwitchCase {
    
    public static void main(String[] args) {
        
        int nomor;
        String nama;
        Scanner masuk = new Scanner (System.in);
        
        System.out.print("\n");
        System.out.println("                     CAFE CERIA                      ");
        System.out.println("              ANEKA MAKANAN & MINUMAN                ");
        System.out.println("-----------------------------------------------------");
        System.out.println("                    SPECIAL MENU :                   ");
        System.out.println("                  1. Nasi Goreng                     ");
        System.out.println("                  2. Nasi Padang                     ");
        System.out.println("                  3. Soto Ayam                       ");
        System.out.println("                  4. Soda Gembira                    ");
        System.out.println("                  5. Kopi Susu                       ");
        System.out.println("-----------------------------------------------------");
        System.out.print("\n");
        
        System.out.print("Masukkan Nama Pembeli" + "\t" + "\t" + " : ");
        nama = masuk.nextLine();
        System.out.print("\n");
        
        System.out.print("Silakan Masukan Pilihan Anda" + "\t" + " : ");
        nomor = masuk.nextInt();
        System.out.print("\n");
        
        switch (nomor) {
            case 1 -> {
                System.out.println("Makanan Yang Anda Pesan Adalah Nasi Goreng");
                System.out.println("Pesanan Akan Segera Kami Antar.......");
                System.out.println("Terima Kasih "+ nama + " Telah Berkunjung Di Cafe Ceria");
            }
            case 2 -> {
                System.out.println("Makanan Yang Anda Pesan Adalah Nasi Padang");
                System.out.println("Pesanan Akan Segera Kami Antar.......");
                System.out.println("Terima Kasih "+ nama + " Telah Berkunjung Di Cafe Ceria");
            }
            case 3 -> {
                System.out.println("Makanan Yang Anda Pesan Adalah Soto Ayam");
                System.out.println("Pesanan Akan Segera Kami Antar.......");
                System.out.println("Terima Kasih "+ nama + " Telah Berkunjung Di Cafe Ceria");
            }
            case 4 -> {
                System.out.println("Minuman Yang Anda Pesan Adalah Soda Gembira");
                System.out.println("Pesanan Akan Segera Kami Antar.......");
                System.out.println("Terima Kasih "+ nama + " Telah Berkunjung Di Cafe Ceria");
            }
            case 5 -> {
                System.out.println("Minuman Yang Anda Pesan Adalah Kopi Susu");
                System.out.println("Pesanan Akan Segera Kami Antar.......");
                System.out.println("Terima Kasih "+ nama + " Telah Berkunjung Di Cafe Ceria");
            }
        }
        System.out.print("\n");
    }
}
