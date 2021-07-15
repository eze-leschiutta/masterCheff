package edu.it.maquinaestados;

import edu.it.estados.IState;
import edu.it.model.DatosActivos;

public class PublicarContadoConLiqui implements IState {
    public IState go() {
        System.out.println("******************************************");
        System.out.println(DatosActivos.calcularCCL());
        System.out.println("******************************************");

        return new EstadoInicial();
    }
}
