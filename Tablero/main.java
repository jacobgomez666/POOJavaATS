package Tablero;

import javax.swing.*;

public class main {
    public static void main (String args[]){
Tablero table1;
        int x,y;
        int opcion=0;
        int incremento=0;
        x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa coordenada inicial de X: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa coordenada inicial de y: "));


        table1 = new Tablero(x,y);
int posX= table1.getX();
int pozY= table1.getY();
        System.out.println("Tu posicion incial de X: "+posX + " Y: "+pozY );

        do {
            System.out.println("\n\t.:MENU.");
            System.out.println("1. Move Up");
            System.out.println("2. Move Down");
            System.out.println("3. Move Right");
            System.out.println("4. Move Left");
            System.out.println("5. Salir");
            System.out.print("Escoja una opcion");
            opcion= Integer.parseInt(JOptionPane.showInputDialog("Mover hacia? "));


    if (opcion !=5){
        incremento= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad espacion a moverse"));

    }

    switch (opcion) {
        case 1:
            table1.movArriba(incremento);
            break;
        case 2:
            table1.movAbajo(incremento);
            break;
        case 3:
            table1.movDerecha(incremento);
            break;
        case 4:
            table1.movIzquierda(incremento);
            break;
        case 5:
            break;
        default:
            System.out.printf("Error se quivoco de opcion de menu");
            break;
    }

            System.out.printf("Tu posicion actual  de X: "+table1.getX()+ " Y "+table1.getY() );

        }while (opcion != 5);

    }
}
