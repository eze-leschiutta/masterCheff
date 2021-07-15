package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public interface Discador {
    public DatosLlamada realizarLlamada(Usuario u);
    public void emitirMensaje(DatosLlamada llamadaEnCurso);
    public void cortar(DatosLlamada llamadaEnCurso);
}
