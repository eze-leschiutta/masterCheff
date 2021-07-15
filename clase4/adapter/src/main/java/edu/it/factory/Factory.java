package edu.it.factory;

import dialerpluspro.DialerPro;
import edu.it.services.DialerPlusProAdapter;
import edu.it.services.ProcesoDiscado;

public class Factory {
    public static ProcesoDiscado crearDiscador() {
        return new ProcesoDiscado(new DialerPlusProAdapter(new DialerPro()));
    }
}
