package edu.it.maquinaestados;

import edu.it.estados.IState;
import java.util.Scanner;

public class IngresoValorLocalManual implements IState {
    public IState go() {
        System.out.println("Ingrese por favor el promedio entre comprador y vendedor");
        Scanner scn = new Scanner(System.in);
        String cotizacion = scn.nextLine();
        edu.it.model.DatosActivos.precioRosario = cotizacion;

        return new PublicarContadoConLiqui();
    }
}
