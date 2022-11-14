package Cuadrilatero;

public class Cuadrilatero {
    private float lado1, lado2;

//    constructor
    public Cuadrilatero(float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;

    }

    public Cuadrilatero(float lado1){
        this.lado1 = lado2 = lado1;

    }

//    Metodos area y perimetro
    public float getPerimetro(){
        return (lado1+lado2)*2;
    }

    public float getArea(){
        return (lado1 * lado2);
    }




}
