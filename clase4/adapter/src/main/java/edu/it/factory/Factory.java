package edu.it.factory;

import edu.it.services.Discador;
import edu.it.services.ProcesoDiscado;

public class Factory {
    public static ProcesoDiscado crearDiscador() {
        return new ProcesoDiscado(new Discador());
    }
}
