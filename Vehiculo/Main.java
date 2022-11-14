package Vehiculo;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {


    public static int indiceCocheMBarato( Vehiculo coches[]){

        float precio;
        int indice=0;
        precio= coches[0].getPrecio();
        for ( int i=1; i<coches.length; i++){
            if (coches[i].getPrecio()< precio){
                precio=coches[i].getPrecio();
                indice=i;
            }
        }
return indice;
    }


    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numVehiculos;
        int indiCocheMasBarato;

        System.out.printf("Digita la cantidad de vehiculos: ");
        numVehiculos= entrada.nextInt();
//        Guardo el numero de vehiculos en un array
//        creamos varios objetos de la clase Vehiculo

        Vehiculo coches[] = new Vehiculo[numVehiculos];

//        recorremos nuestro array de vehiculos para llenar sus propiedades
        for (int i=0; i< coches.length; i++){
            System.out.print("\n Digite las propiedades del coche"+(i+1)+": ");
            System.out.print("Introduzca Marca: ");
            marca= entrada.nextLine();
            entrada.nextLine();

            System.out.print("Introduzca modelo");
            modelo= entrada.nextLine();
            System.out.print("Introduzca Precio");
            precio= entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }

        indiCocheMasBarato=indiceCocheMBarato(coches);

        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiCocheMasBarato].mostrarDatos());




//        Ahora recorremos  el objeto array vehiculos para imprimir sus propiedades

//        for (int i=0; i< coches.length; i++){
//            System.out.println("Estos vehiculos digitastes");
//            System.out.println(coches[i].mostrarDatos());
//
//        }


//        Metodo para encontra el coche mas barato



    }
}
