package Herencias;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected int edad;

//    CONSTRUCTOR
    public  Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

//    GETTERS

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }
}
