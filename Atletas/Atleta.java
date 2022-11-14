package Atletas;

public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

//    constructor
public Atleta(int numeroAtleta, String nombre, float tiempoCarrera){
    this.numeroAtleta =numeroAtleta;
    this.nombre=nombre;
    this.tiempoCarrera=tiempoCarrera;

}

//METODO PARA OBTENER EL TIEMPO DE CARRERA
    public float getTiempoCarrera(){
    return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "Numero de Atleta: "+numeroAtleta+ "Nombre: "+nombre+" Tiempo de Carrera: "+tiempoCarrera;
    }

}
