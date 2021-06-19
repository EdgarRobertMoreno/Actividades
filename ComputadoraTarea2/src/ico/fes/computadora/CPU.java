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
public class CPU {
    
    private String marca;
    private String modelo;
    private int velocidadDelProcesador;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadDelProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadDelProcesador = velocidadDelProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadDelProcesador() {
        return velocidadDelProcesador;
    }

    public void setVelocidadDelProcesador(int velocidadDelProcesador) {
        this.velocidadDelProcesador = velocidadDelProcesador;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadDelProcesador=" + velocidadDelProcesador + '}';
    }
    
   
    
}
