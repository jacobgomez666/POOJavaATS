package SucursalPaqueteria;

import sun.awt.windows.WingDings;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

//    METODO ESTATICO PARA BUSCAR CADA SUCURSAL

    public static int buscarSucursal(Sucursal todas[], int numeroSucursal, int contadorSucursal){
        int indice =0;
        boolean encontrado = false;

//        Busqueda Secuencial
        for (int i= 0; i<contadorSucursal; i++){
            if (todas[i].getNumeroSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;
            }
        }
if(encontrado == false){
indice = -1;
}


        return indice;
    }

                   //METODO PARA BUSCAR PAQUETE
                   public static int buscarPaquete(Paquete todos[], int numeroPaquete, int contadorPaquete){
                       int indice =0;
                       boolean encontrado = false;

//        Busqueda Secuencial
                       for (int i= 0; i<contadorPaquete; i++){
                           if (todos[i].getNumeroPaquete() == numeroPaquete){
                               encontrado = true;
                               indice = i;
                           }
                       }
                       if(encontrado == false){
                           indice = -1;
                       }


                       return indice;
                   }


    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        int numeroSucursal;
        int numeroPaquete;
        int prioridad;
        int opcion;
        String ciudad;
        String direccion;
        String dni;
        double peso;
        double precioPaquete;

//Variables contadores para los bucles
        int contadorSucursal=0;
        int contadorPauete =0;
        int indiceSucursal;
        int indicePaquete;

        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

                               //MENU DE OPCIONES
        do {
            System.out.println("\t: MENU");
            System.out.println("1.- Crear una nueva sucursal");
            System.out.println("2.- Enviar Paquete");
            System.out.println("3.- Consultar Sucursal");
            System.out.println("4.- Consultar Paquete");
            System.out.println("5.- Mostrar todas las sucursales");
            System.out.println("6.- Mostrar todos los paquetes");
            System.out.println("7.- Salir");
            System.out.println("DIGITE UNA DE LAS OPCIONES");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nDigite el numero de sucursal");
                    numeroSucursal= entrada.nextInt();
                    System.out.println("\nDigite la direccion: ");
                    direccion = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("\nDigite la ciudad");
                    ciudad = entrada.nextLine();

                   sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                   contadorSucursal++;
                   break;

                case 2:
                    System.out.println("\nDigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    indiceSucursal =buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1){
                        System.out.println("La sucursal no existe");
                    }else{
                        System.out.println("\nDigite el numero de paquete: ");
                        numeroPaquete = entrada.nextInt();
                        System.out.println("\nDigite el DNI de la persona: ");
                        dni = entrada.nextLine();
                        System.out.println("\nDigite el peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.println("Digita la prioridad (0=normal, 1=alta, 2=express)");
                        prioridad = entrada.nextInt();

                        paquete [contadorPauete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                        precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPauete]);
                        System.out.println("\nEl precio es: "+precioPaquete);
                        contadorPauete++;


                    }

                    break;
                case 3:
                    System.out.println("\nDigite el numero de sucursal");
                    numeroSucursal = entrada.nextInt();;

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1){
                        System.out.println("La sucursal no existe");
                    }
                    else{
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.println("\n Digite el numero de paquete");
                    numeroPaquete = entrada.nextInt();

                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPauete);
                    if (indicePaquete == -1){
                        System.out.println("El paquete no existe");
                    }else{
                        System.out.println("\nLos datos del paquete eson: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;

                case 5:
                    for (int i=0; i<contadorSucursal; i++){
                        System.out.println("\nLos datos de las sucursales son"+(i+1)+": ");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;

                case 6:
                    for (int i=0; i<contadorPauete; i++){
                        System.out.println("\nLos datos de los Paquetes son"+(i+1)+": ");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;

                case 7: break;

                default:
                    System.out.println("Error, opcion de menu icorrecta");
            }

            System.out.println(".............");
        }while (opcion != 7);


    }
}
