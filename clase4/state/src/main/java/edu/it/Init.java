package edu.it;

import edu.it.estados.IState;
import edu.it.maquinaestados.EstadoInicial;
import static edu.it.util.Utiles.dormir;

public class Init {
    public static void main(String[] args) {
        IState estado = new EstadoInicial();
        for (;;) {
            estado = estado.go();
            dormir(2);
        }
    }
}
