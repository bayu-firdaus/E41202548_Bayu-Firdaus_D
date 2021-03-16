/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Scanner;

/**
 *
 * @author Bayu Firdaus
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
    // Membuat Scanner    
    Scanner input = new Scanner (System.in);
    
    // Memasukkan input dari keyboard
        System.out.println("First Name = ");
        String fname = input.next ();

        System.out.println("Last Name = ");
        String lname = input.next ();

        System.out.println("Student ID = ");
        String stuid = input.next ();

        System.out.println("Student Status = ");
        String stutstatus = input.next ();
    }

  
}
