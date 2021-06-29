package edu.it;

import java.util.HashMap;

public class PiedraPepelTijera {
    private static HashMap<PlanteoJugada, Integer> mapaFn;
    static
    {
        mapaFn = new HashMap<PlanteoJugada, Integer>();

        mapaFn.put(new PlanteoJugada(PPT.PIEDRA, PPT.PAPEL), 2);
        mapaFn.put(new PlanteoJugada(PPT.PIEDRA, PPT.TIJERA), 1);
        mapaFn.put(new PlanteoJugada(PPT.PIEDRA, PPT.PIEDRA), 0);

        mapaFn.put(new PlanteoJugada(PPT.PAPEL, PPT.PIEDRA), 1);
        mapaFn.put(new PlanteoJugada(PPT.PAPEL, PPT.TIJERA), 2);
        mapaFn.put(new PlanteoJugada(PPT.PAPEL, PPT.PAPEL), 0);

        mapaFn.put(new PlanteoJugada(PPT.TIJERA, PPT.PAPEL), 1);
        mapaFn.put(new PlanteoJugada(PPT.TIJERA, PPT.PIEDRA), 2);
        mapaFn.put(new PlanteoJugada(PPT.TIJERA, PPT.TIJERA), 0);
    }
    public static Integer jugar(PPT jugador1, PPT jugador2) {
        return mapaFn.get(new PlanteoJugada(jugador1, jugador2));
    }
}
