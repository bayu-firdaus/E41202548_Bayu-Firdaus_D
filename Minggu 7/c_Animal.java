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
public class c_Animal {
    public void makeNoise() {
        System.out.println("Talk");
    }
    
    public static void main(String[] args) {
        c_Animal animal = new c_Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        c_Animal animalDog = new Dog();
        animalDog.makeNoise();
        
        if (animal instanceof c_Animal) {
            System.out.println("animal is Animal");
        }
        
        if (dog instanceof c_Animal) {
            System.out.println("Dog is Animal");
        }
        
        if (animalDog instanceof c_Animal) {
            System.out.println("animalDog is Animal"); 
        }
        
        if (animal instanceof Dog) {
            System.out.println("Animal is Dog");
        }
    }
    
        
}
