package Tablero;

public class Tablero {
    private int x, y;

//    constructor

    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }

//    Metodos mover a-d-z-a
    public void movArriba(int incremento){
        y += incremento;

    }
    public void movAbajo(int incremeneto){
      y -= incremeneto;
    }
    public void movDerecha(int incremento){
        x += incremento;

    }

    public void movIzquierda(int incremento){
       x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

}

