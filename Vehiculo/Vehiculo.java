package Vehiculo;

public class Vehiculo {

    private String marca;
    private String modelo;
    private float precio;

//    Constructor
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

//    Metodos obtener precion y mostrar datos

    public float getPrecio(){
        return precio;
    }
    public String mostrarDatos(){
        return "Marca: "+marca+" Modelo: "+modelo+" Precio: "+precio;
    }
}
