/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.unam.animal;

/**
 *
 * @author seel_
 */
public class Perro extends Animal{
    
    private String raza;
    private String sonido;

    public Perro() {
    }

    public Perro(String raza, String sonido) {
        this.raza = raza;
        this.sonido = sonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", sonido=" + sonido + '}';
    }
    
     
    
}
