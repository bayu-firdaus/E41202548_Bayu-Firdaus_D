/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author asus
 */
public class TipeDataString {
    
    public static void main(String[] args) {
        
        String s1 = "ABC";
        String s2 = "DEF";
        String s3 = "AB" + "C";
        
        System.out.println(s1 != s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
        System.out.println(s2 != s3);
        System.out.println(s3 == s1);        
    }
}
