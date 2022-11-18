package Herencias.ClasesMetodosFinal;

public class FiguraCerrada extends Figura{

    private int nLados;

    public FiguraCerrada(int nLados, double tamanio){
        super(tamanio);
    }


//  Metodo dibujar final que no se puede usar por las demas subclases.
    final public void dibujar(){
        System.out.println("Estoy dibujando una figura cerrada");
    }
}
