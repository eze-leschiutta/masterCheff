package edu.it;

import edu.it.factory.Factory;
import edu.it.model.Usuario;
import edu.it.services.CreadorDeUsuario;

public class Init {
    public static void main(String[] args) {
        var conversor = Factory.obtenerConversor();
        var usu = CreadorDeUsuario.crear();
        long t1 = System.currentTimeMillis();
        for (int x : new int[10000]) {
            var usuEnJson = conversor.toJson(usu);
            conversor.fromJson(usuEnJson, Usuario.class);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
