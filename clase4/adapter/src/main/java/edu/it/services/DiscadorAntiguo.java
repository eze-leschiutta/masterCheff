package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;
import static edu.it.util.Utiles.dormir;

public class DiscadorAntiguo implements Discador {
    public DatosLlamada realizarLlamada(Usuario u) {
        System.out.println("Realizando llamada...");
        dormir(1);
        var dl = new DatosLlamada();
        return dl;
    }
    public void emitirMensaje(DatosLlamada llamadaEnCurso) {
        System.out.println("Emitiendo un mensje... ");
        dormir(2);
    }
    public void cortar(DatosLlamada llamadaEnCurso) {
        System.out.println("Finalizar llamada");
        dormir(2);
    }
}
