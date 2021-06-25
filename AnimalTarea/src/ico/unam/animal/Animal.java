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
public class Animal{
    
    private int numeroPatas;
    private Perro perro;
    private Gato gato;

    public Animal() {
    }

    public Animal(int numeroPatas, Perro perro, Gato gato) {
        this.numeroPatas = numeroPatas;
        this.perro = perro;
        this.gato = gato;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", perro=" + perro + ", gato=" + gato + '}';
    }
    
    
    
}
