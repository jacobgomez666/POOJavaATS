package Herencias;

public class Estudiante extends Persona {
    private  int codigoEstudiante;
    private float notaFinal;

//CONSTRUCTOR DE CLASE QUE HEREDA DE OTRA CLASE
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
       super(nombre, apellido, edad);
       this.codigoEstudiante = codigoEstudiante;
       this.notaFinal = notaFinal;

    }


    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("Codigo del Estudiante: "+codigoEstudiante);
        System.out.println("Nota fnal: "+notaFinal);
    }

}
