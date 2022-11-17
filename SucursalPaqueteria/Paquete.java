package SucursalPaqueteria;

import java.lang.reflect.Constructor;

public class Paquete {

    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

//    CONSTRUCTOR

    public  Paquete(int numeroPaquete, String dni, double peso, int prioridad){
        this.prioridad = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

//    Metodos Getters

    public int getNumeroPaquete(){
        return numeroPaquete;
    }
    public String getDni(){
        return dni;
    }
    public double getPeso(){
        return peso;
    }
    public int getPrioridad(){
        return prioridad;
    }

//    Metodos mostrarDatos

    public String mostrarDatosPaquete(){
        return "EL numero de paquete es: "+getNumeroPaquete()+" con DNI: "+getDni()+" con un peso de: "+getPeso()+" y su prioridad es: "+getPrioridad();
    }



}
