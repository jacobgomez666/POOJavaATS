package Herencias.ClasesMetodosFinal;

//Clase final que ya no puede heredar o tener hijos (subclase)
final public class Cuadrado extends FiguraCerrada{
    private  double area;

    public Cuadrado(double area, int nLados, double tamanio){
        super(nLados, tamanio);
        this.area = area;

    }

    public void dibujarCuadrado(){
        System.out.println("Estoy dibujando un cuadrado");
    }
}
