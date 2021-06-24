package com.mycompany.app;
import com.mycompany.app.objeto.*;

public class Principal {
    private Carros car[];
    public Principal(){
        car = new Carros[20];
        inicializarCarros();
        verificar();
    }
    public void verificar(){
        for (int i = 0; i < car.length; i++) {
            if (car[i] instanceof Carga) {
                System.out.println(i+" Carro es de carga nombre: "+ car[i].getNombre());
            }
            if (car[i] instanceof Carrera) {
                System.out.println(i +" Carro es de carrera nombre: "+ car[i].getNombre());
            }
            if (car[i] instanceof Camionetas) {
                System.out.println(i+" Carro es una Camioneta nombre: "+ car[i].getNombre());
            }
        }
    }
    public void inicializarCarros(){
        for (int i = 0; i < car.length; i++) {
            int ale = aleatorio();
            //System.out.println(ale);
            switch (ale) {
                case 1:
                    car[i] = new Carga(25.5, 90.8, 1.8);
                    break;
                case 2:
                    car[i] = new Carrera(300, 8.2);
                    break;
                case 3:
                    car[i] = new Camionetas(50, 110, 3.0);
                    break;
                default:
                    System.out.print("no se encontro este numero\n"); 
                    break;
            }
        }
    }
    public int aleatorio(){
        return (int) (Math.random()*3)+1;
    }

}
