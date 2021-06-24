package com.mycompany.app.objeto;

public class Camionetas extends Carros {
    private boolean esGasolina;
    private String nombre;
    private int Pasajeros;

    private static int contadorInstancias;

    public Camionetas(int pasajeros,double velocidadMaxima,double aceleracionBase){
        super(100, 2, velocidadMaxima, aceleracionBase);
        this.Pasajeros = pasajeros;
        this.nombre = "Camioneta"+this.getInstancia();
        Camionetas.contadorInstancias++;
    }
    public int getInstancia(){
        return Camionetas.contadorInstancias;
    }
    public String getNombre(){  
        return this.nombre;
    }
    public void combustible(){  
        this.esGasolina = true;
    }
    
}
