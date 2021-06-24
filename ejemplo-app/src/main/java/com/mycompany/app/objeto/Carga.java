package com.mycompany.app.objeto;

public class Carga extends Carros {
    private String nombre;
    private double cantidadCarga;
    private boolean esGasolina;
    private static int contadorInstancias;

    public Carga(double cantidadCarga,double velocidadMaxima, double aceleracionBase){
        super(100, 2, velocidadMaxima, aceleracionBase);
        this.cantidadCarga = cantidadCarga;
        this.combustible();
        nombre = "Carga"+getInstancia();
        Carga.contadorInstancias++;
    }
    public static int getInstancia(){
        return Carga.contadorInstancias;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void combustible(){
        esGasolina = true;
    }
    public double getCantidadCarga() {
        return this.cantidadCarga;
    }

    public void setCantidadCarga(double cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    public boolean isEsGasolina() {
        return this.esGasolina;
    }

    public boolean getEsGasolina() {
        return this.esGasolina;
    }

    public void setEsGasolina(boolean esGasolina) {
        this.esGasolina = esGasolina;
    }
}

   
