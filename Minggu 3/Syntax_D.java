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
public class Syntax_D {
    
    public static void main(String[] args) {
        
        int BarangPertama, BarangKedua, BarangKetiga, BarangKeempat, BarangKelima, TotalHarga;
        
        String nama, hadiah = "-";
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("            Kharisma Agung Plaza < KAP >             ");
        System.out.println("               Promo Belanja Berhadiah               ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama          ");
        System.out.println("           Dengan Harga Minimun Rp. 10.000           ");
        System.out.println("-----------------------------------------------------");
        
        System.out.print("Masukkan Nama Pembeli" + "\t" + "\t" + " : ");
        nama = masuk.nextLine();
        System.out.print("\n");
        
        System.out.print("Masukkan Harga Barang Ke - 1 " + "\t" + " : ");
        BarangPertama = masuk.nextInt();
        System.out.print("Masukkan Harga Barang Ke - 2 " + "\t" + " : ");
        BarangKedua = masuk.nextInt();
        System.out.print("Masukkan Harga Barang Ke - 3 " + "\t" + " : ");
        BarangKetiga = masuk.nextInt();
        System.out.print("Masukkan Harga Barang Ke - 4 " + "\t" + " : ");
        BarangKeempat = masuk.nextInt();
        System.out.print("Masukkan Harga Barang Ke - 5 " + "\t" + " : ");
        BarangKelima = masuk.nextInt();
        System.out.print("\n");
        
        TotalHarga = BarangPertama + BarangKedua + BarangKetiga + BarangKeempat + BarangKelima;
        System.out.println("Total Harga Pembelian Atas Nama" + "\t" + ": " + nama + "\n" + "Adalah Rp " + TotalHarga);
        
        if (TotalHarga >= 100000) {
            hadiah = " 1 Buah Sepatu Nike Air Jordan 1";
            System.out.println("\n");
            System.out.println("SELAMAT......");
            System.out.println("Anda Mendapatkan Hadiah :" + hadiah);
            System.out.println("\n");
            System.out.println("-----------------------------------------------------");
            System.out.println("                     Terima Kasih                    ");
            System.out.println("    Anda Sudah Berbelanja di Kharisma Agung Plaza    ");
            System.out.print("\n");
        }
        
        
    }
}
