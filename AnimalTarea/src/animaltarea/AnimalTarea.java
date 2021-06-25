/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaltarea;

import ico.unam.animal.Animal;
import ico.unam.animal.Gato;
import ico.unam.animal.Perro;

/**
 *
 * @author seel_
 */
public class AnimalTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Animal(4, new Perro(" Labrador Retriever ", " Wuau! Wuau! "), new Gato(" Gato Persa ", " Miau Miau "));
        System.out.println(a1);
        
    }
    
}
