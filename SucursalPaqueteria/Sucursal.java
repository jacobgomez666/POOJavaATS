package SucursalPaqueteria;

public class Sucursal {

//    Atributos
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

//    CONSTRUCTOR
    public Sucursal(int numeroSucursal, String direccion, String ciudad){
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;

    }

//    Metodos getters

    public int getNumeroSucursal(){
        return  numeroSucursal;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getCiudad(){
        return ciudad;
    }

    public String mostrarDatosSucursal(){
        return "El numero de sucursal es: "+getNumeroSucursal()
                +" con direccion en: "+getDireccion()
                +" y ubicado en la ciudad de: "+getCiudad();
    }

    public double calcular_precio(Paquete todas){
        double precio;
        precio = todas.getPeso();
        if(todas.getPrioridad() == 1){
            precio = precio +10;
        }
        if(todas.getPrioridad() == 2){
           precio = precio +20;
        }
        return precio;

    }


}
