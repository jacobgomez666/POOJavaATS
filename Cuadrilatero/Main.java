package Cuadrilatero;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {
Cuadrilatero cuadri1 ;
        float lado1, lado2;
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa lad1"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa lad2"));

        if (lado1 == lado2){
            cuadri1 = new Cuadrilatero(lado1);

        }else{
            cuadri1 = new Cuadrilatero(lado1, lado2);
        }

        float peri = cuadri1.getPerimetro();
        float area= cuadri1.getArea();
        System.out.printf("EL perimetro es: "+peri);
        System.out.printf("El area es: "+area);

    }
}