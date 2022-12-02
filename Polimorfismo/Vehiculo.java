package Polimorfismo;

public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected  String modelo;

//    CONSTRUCTOR
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }

//        GETTERS

    public String getMatricula(){
        return  matricula;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String mostrarDatos(){
        return "Matricula: "+matricula+" \nMarca: "+marca+" \nModelo: "+modelo;

    }
}
