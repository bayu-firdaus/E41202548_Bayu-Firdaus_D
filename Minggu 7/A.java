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
class A {
    void callThis() {
        System.out.println("Inside Class A's method");
    }  
}

class B extends A {
    @Override
    void callThis() {
        System.out.println("Inside Class B's method");
    }
}

class C extends A {
    @Override
    void callThis() {
        System.out.println("Inside Class C's method");
    }
}
