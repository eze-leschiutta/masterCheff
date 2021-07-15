package edu.it.services;

import dialerpluspro.DialerPro;
import dialerpluspro.InfoCall;
import dialerpluspro.User;
import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public class DialerPlusProAdapter implements Discador {
    private DialerPro dialerPro;

    public DialerPlusProAdapter(DialerPro dialerPro) {
        this.dialerPro = dialerPro;
    }
    public DatosLlamada realizarLlamada(Usuario u) {
        System.out.println("Hacer transformacion de Usuario a user");
        var user = new User();
        var infoCall = dialerPro.dial(user);
        System.out.println("Transformar la respuesta infoCall en DatosLlamada ");
        return new DatosLlamada();
    }

    public void emitirMensaje(DatosLlamada llamadaEnCurso) {
        System.out.println("Hacer la transformacion de datosLlamada a infoCall");
        var infoCall = new InfoCall();
        dialerPro.playMessage(infoCall);
    }
    public void cortar(DatosLlamada llamadaEnCurso) {
        System.out.println("Hacer la transformacion de datosLlamada a infoCall");
        var infoCall = new InfoCall();
        dialerPro.hangup(infoCall);
    }
}
