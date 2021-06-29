package edu.it;

import java.util.List;
import java.util.Random;

public class CienJugadas {
    List<NotificarApostador> observadores;

    public CienJugadas(List<NotificarApostador> observadores) {
        this.observadores = observadores;
    }

    private PPT mapear(Integer i) {
        switch (i) {
            case 0:
                return PPT.PIEDRA;
            case 1:
                return PPT.PAPEL;
            case 2:
                return PPT.TIJERA;
        }
        throw new RuntimeException("No tiene sentido");
    }
    public void start() {
        for (Integer x : new Integer[100]) {
            Integer j1 = new Random().nextInt(3);
            Integer j2 = new Random().nextInt(3);

            System.out.println("Jugador 1 " + mapear(j1).name());
            System.out.println("Jugador 2 " + mapear(j2).name());

            Integer ganador = PiedraPepelTijera.jugar(mapear(j1), mapear(j2));
            System.out.println("Resultado: " + ganador);
            System.out.println("");
            System.out.println("");

            for (NotificarApostador n : observadores) {
                n.resultado(ganador);
            }
        }
    }
}
