package CuentaBancaria;

import sun.awt.windows.WingDings;

import javax.swing.undo.CannotUndoException;
import java.util.Scanner;

public class Principal {

    //    Metodo estaticp para la busqueda secuencial de una cuenta
    public static int buscarNumCuenta(Cuenta cuentas[], int n) {
        int i = 0 , indice = 0;
        boolean found = false;

//        Busqueda secuencial
        while ((i < cuentas.length && (found == false))) {
            if (cuentas[i].getNumeroCuenta() == n){
                found = true;
                indice=i;
        }
        i++;

    }

        if (found == false){
            indice=-1;
        }
    return indice;

}


    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        String nombre, apellido, dni;
        int numeroCuenta, nCuentas;
        int indiceCuenta;
        double saldo, cantidad;
        int opcion;

        Cuenta cuentas[];
        Cliente cliente;

        System.out.println("Digite el nombre de Cliente: ");
        nombre= entrada.nextLine();
        System.out.println("Digite el apellido: ");
        apellido= entrada.nextLine();
        System.out.println("Digita el dni");
        dni= entrada.nextLine();

        System.out.println("Ahora digite cuantas cuentas tiene: ");
        nCuentas= entrada.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i=0 ; i<cuentas.length; i++) {
            System.out.println("Digite los datos para la cuenta" + (i + 1) + ": ");
            System.out.println("Digite el numero de Cuenta");
            numeroCuenta = entrada.nextInt();
            System.out.println("Digita el saldo de la cuenta: ");
            saldo = entrada.nextDouble();


            cuentas[i] = new Cuenta(numeroCuenta, saldo);

        }
//        Inicializamos la clase cuenta
            cliente = new Cliente(nombre, apellido, dni, cuentas);

//            MENU DE OPCIONES: Consultar, retirar o ingresar.


do{
    System.out.println("\t.: MENU:.");
    System.out.println("1. Ingrese dinero en la cuenta");
    System.out.println("2. Retirar dinero en la cuenta");
    System.out.println("3. Consultar dinero en la cuenta");
    System.out.println("4. Salir");
    opcion= entrada.nextInt();

    switch (opcion){

        case  1:
            System.out.println("Digita al Numero de cuenta a donde vas a ingresar el dinero");
            numeroCuenta= entrada.nextInt();
            indiceCuenta=buscarNumCuenta(cuentas, numeroCuenta);

            if (indiceCuenta == -1){
                System.out.println("\nEL numero de Cuenta ingresado no existe");
            }else{
                System.out.println("\n Digita la cantidad de dinero a ingresar");
                cantidad = entrada.nextDouble();
                cliente.ingresarDinero(indiceCuenta, cantidad);
                System.out.println("\nIngreso realizado correctamenrte");
                System.out.println("Tu saldo disponible ahora es: "+cliente.consultarSaldo(indiceCuenta));
            }
            break;

        case 2:
            System.out.println("Digita el numero de cuenta donde retiraras $");
            numeroCuenta= entrada.nextInt();
            indiceCuenta =buscarNumCuenta(cuentas, numeroCuenta);

            if (indiceCuenta == -1){
                System.out.println("\n EL numero de cuenta ingresado no existe");
            }else{
                System.out.println("\nDigite la cantidad de dinero a retirar: ");
                cantidad = entrada.nextDouble();

                if (cantidad >  cliente.consultarSaldo(indiceCuenta)){
                    System.out.println("Fondos insuficientes");

                }else{
                    cliente.retirarDinero(indiceCuenta, cantidad);
                    System.out.println("\nRetiro realizado con exito");
                    System.out.println("Saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
                }
            }

            break;

        case  3:
            System.out.println("\nDigita el numero de cuenta a consultar");
            numeroCuenta = entrada.nextInt();
            indiceCuenta=buscarNumCuenta(cuentas, numeroCuenta);

            if (indiceCuenta ==-1 ){
                System.out.println("El numeor de cuenta ingresado no existe");
            }else{
                System.out.println("Tu saldo es: "+cliente.consultarSaldo(indiceCuenta));
            }

            break;

        case 4: break;
        default:
            System.out.println("Error se confundio de opcion de menu");
    }

}while (opcion !=4);

        }
    }

