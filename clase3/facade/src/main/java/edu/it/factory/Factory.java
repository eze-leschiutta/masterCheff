package edu.it.factory;

import edu.it.UnaSolaInterfaz;

public class Factory {
    public static UnaSolaInterfaz obtenerConversor() {
        String nombreClase = System.getProperty("conversor");
        try {
            return (UnaSolaInterfaz)Class
                        .forName(nombreClase)
                        .getConstructor()
                        .newInstance();
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
