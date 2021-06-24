package com.mycompany.app.objeto;

public class Carrera extends Carros{
    private String nombre;
    private boolean esGasolina;

    private static int contadorInstancias;

    public Carrera(double velocidadMaxima, double aceleracionBase){
        super(100, 2, velocidadMaxima, aceleracionBase);
        nombre = "Carrera"+getInstancia();
        Carrera.contadorInstancias++;
    }
    public String getNombre(){
        return this.nombre;
    }
    public static int getInstancia(){
        return Carrera.contadorInstancias;
    }
    public void combustible(){
        this.esGasolina = true;
    }
    public void turbo(){
        this.setAceleracionBase(3*getAceleracionBase());
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carrera)) {
            return false;
        }
        Carrera carrera = (Carrera) o;
        return esGasolina == carrera.esGasolina;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(esGasolina);
    }

}
