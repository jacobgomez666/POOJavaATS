package Triangulo_isoceles;

public class TrianguloIsoceles {
    private double base;
    private  double lado;


//    Constructor
    public TrianguloIsoceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }


//    Metodo para obtener el Perimetro
    public double obtenerPerimetro(){
        double perimetro= 2 *(lado+base);
        return perimetro;
    }
//    Metodo para obteber el area
    public double obtenerArea(){
       double area=(base *Math.sqrt((lado*lado) - ((base*base)/4)))/2;
       return area;
    }
//    Metodo para mostrar datos

    public String mostrarDatos(){
        return "Base: "+base+ "\nlado: "+lado+"\nperimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea();
    }




}
