package Atletas;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public  static  void main (String args[]){

        Scanner entrada= new Scanner(System.in);

        String nombre;
        int numeroAtleta, nAtletas;
        float tiempoCarrera;
        int indiceAtletaGanador;

//        pedimos el numero de atletas
        System.out.println("Digita el numero de atletas a participar");
                nAtletas=entrada.nextInt();

//        Creamos los objetos para cada atleta
        Atleta atletas[] = new Atleta[nAtletas];

//        Pedimos los datos de cada atleta con un bucle

        for (int i = 0; i<atletas.length; i++){
           System.out.println("Introduzca los datos del Atleta "+(i+1)+": ");
            System.out.println("Numero de Atleta: ");
            numeroAtleta= entrada.nextInt();
            entrada.nextLine();
            System.out.println("Nombre del Atleta: ");
            nombre=entrada.nextLine();

            System.out.println("Tiempo que corrio: ");
            tiempoCarrera=entrada.nextFloat();

//            guardo las variables o datos en el array pobjeto
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);


        }

//        variable indiceAtletaGanador = al metodo indiceGanador que tiene
//        como parametro el objeto array de la clase Atleta

        indiceAtletaGanador= indiceGanador(atletas);

        System.out.println("El atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());



    }

//           Metodo para obtener el indice ganador
    public static int indiceGanador(Atleta atletas[]){

        float tiempoCarrera;
        int indice=0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();

        for (int i=1; i<atletas.length; i++){
            if (atletas[i].getTiempoCarrera()<tiempoCarrera){
                tiempoCarrera=atletas[i].getTiempoCarrera();
                indice=i;

            }
        }
        return indice;

    }
}


