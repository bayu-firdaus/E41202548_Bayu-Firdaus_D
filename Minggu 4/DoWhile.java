/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_4;

/**
 *
 * @author Bayu Firdaus
 */
public class DoWhile {
    
    public static void main(String[] args) {
        
      int bil = 1;
      
        System.out.println("     PROGRAM DO_WHILE     ");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("----------------------------");
      
      do
      {
          System.out.print(bil + "   ");
          bil*=2;
      }
      while ( bil <=100 );
       System.out.println("\n");    
      
        
    }
    
}
