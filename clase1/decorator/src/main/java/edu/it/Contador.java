package edu.it;

public class Contador implements IContador {
    private int x;
    private EstrategiaAgregaTexto estrategiaAgregaTexto;

    public Contador(EstrategiaAgregaTexto estrategiaAgregaTexto) {
        x = 0;
        this.estrategiaAgregaTexto = estrategiaAgregaTexto;
    }
    public String obtenerTexto() {
        x++;
        String ret = x + " " + estrategiaAgregaTexto.apply(x);
        return ret;
    }
}
