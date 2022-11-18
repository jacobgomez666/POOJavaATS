package Herencias.ClasesMetodosFinal;

public class Main {

    private double tamanio;

    public static void main (String args[]){
//Cuadrado herena atributos y metodos de la clase figura cerrada
//        A si mismo tiene un metodo propio dibujarCuadrado
        
        Cuadrado cuadrado1 = new Cuadrado(15,4, 10);

        cuadrado1.dibujar();
        cuadrado1.dibujarCuadrado();

    }

}
