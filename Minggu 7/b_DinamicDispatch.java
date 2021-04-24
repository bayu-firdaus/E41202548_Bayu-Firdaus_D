/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_7;

/**
 *
 * @author Bayu Firdaus
 */

public class b_DinamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        A ref;
        
        ref = b;
        ref.callThis();
        
        ref = c;
        ref.callThis();
        
        ref = a;
        ref.callThis();
    }
}
