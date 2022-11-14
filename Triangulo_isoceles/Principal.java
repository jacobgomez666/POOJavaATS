package Triangulo_isoceles;

import java.util.Scanner;

public class Principal {

//    Metodo Estaico que devuelvee el traingulo de mayor superficie de su parametro de Arreglo riangulo

    public static double mayorArea(TrianguloIsoceles triangulos[]){

        double area;
        area= triangulos[0].obtenerArea();
        for (int i=1; i< triangulos.length; i++){
            if (triangulos[i].obtenerArea()>area){
                area=triangulos[i].obtenerArea();

            }

        }
        return area;

    }

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("Digita el numero de Triangulos a trabajar: ");
        nTriangulos = entrada.nextInt();

        TrianguloIsoceles triangulos[] = new TrianguloIsoceles[nTriangulos];

        for (int i=0; i<triangulos.length; i++){
            System.out.println("Digite los valores para el triangulo"+(i+1));
            System.out.println("Introduzca la Base: ");
            base=entrada.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado=entrada.nextDouble();

            triangulos[i] = new TrianguloIsoceles(base, lado);

            System.out.println("\n El perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El Area del traingulo es: "+triangulos[i].obtenerArea());

        }

        System.out.println("El area del traingulo de mayor superficie es: "+mayorArea(triangulos));



    }
}
