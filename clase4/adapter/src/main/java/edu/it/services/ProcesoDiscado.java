package edu.it.services;

import edu.it.model.Usuario;
import static edu.it.util.Utiles.dormir;

public class ProcesoDiscado {
    private Discador discador;

    public ProcesoDiscado(Discador discador) {
        this.discador = discador;
    }

    public void run() {
        for (;;) {
            System.out.println("");
            System.out.println("Inicio de llamada");
            dormir(2);
            var datosLlamada = discador.realizarLlamada(new Usuario());
            discador.emitirMensaje(datosLlamada);
            discador.cortar(datosLlamada);
        }
    }
}
