package com.mycompany.app.objeto;

import com.mycompany.app.inter.Movimiento;

public abstract class Carros implements Movimiento{

    private int gasolina;
    private int cantidadPasajeros;
    private double velocidadMaxima;
    private double aceleracionBase;
    private static int contadorInstancias;

    public Carros(int gasolina, int cantidadPasajeros, double velocidadMaxima, double aceleracionBase){
        this.gasolina = gasolina;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;

    }
    public abstract void combustible();
    public abstract String getNombre();

    public int getGasolina() {
        return this.gasolina;
    }
    public void MovimientoDerecha(){
        System.out.println("Girando a la derecha");
    }
    public void MovimientoIzquierda(){
        System.out.println("Girando a la Izquierda");
    }
    public void retorceso(){
        System.out.println("Retrocediendo . . . .");
    }
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getCantidadPasajeros() {
        return this.cantidadPasajeros;
    }

    public void setCantidadPasajeros(int gantidadPasajeros) {
        this.cantidadPasajeros = gantidadPasajeros;
    }

    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracionBase() {
        return this.aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

}