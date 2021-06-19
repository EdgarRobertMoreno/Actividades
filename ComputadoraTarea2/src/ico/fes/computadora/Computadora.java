/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadora;

/**
 *
 * @author seel_
 */
public class Computadora {
    
    private int marca;
    private int modelo;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private CPU CPU;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, Monitor monitor, Mouse mouse, Teclado teclado, CPU CPU) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.CPU = CPU;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + ", CPU=" + CPU + '}';
    }
    
    
}