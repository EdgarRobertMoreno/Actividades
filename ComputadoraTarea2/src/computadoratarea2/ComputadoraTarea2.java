/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoratarea2;

import ico.fes.computadora.CPU;
import ico.fes.computadora.Computadora;
import ico.fes.computadora.Monitor;
import ico.fes.computadora.Mouse;
import ico.fes.computadora.Teclado;

/**
 *
 * @author seel_
 */
public class ComputadoraTarea2 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here

        Computadora c1 = new Computadora ( 12 , 15 , new Monitor (" Lenovo ", " ADM ", 11 ), new Mouse (" Lenovo ", " Estandar ", " Universal "), new Teclado (" LenovoTeclado ", " ModeloEstandar ", 54 , 7 ), new CPU (" CPULenovo ", " ADMGEN ", 100 ));
        
        System.out.println(c1);
        
    }
    
}
