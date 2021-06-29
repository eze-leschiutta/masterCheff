package edu.it;

import edu.it.compradolar.CalculoRestricciones;
import edu.it.compradolar.FactorExclusion;
import edu.it.compradolar.IntegracionManualAnses;
import edu.it.compradolar.MontoDescontable;
import java.util.ArrayList;

public class Init {
    public static void problemaCompraDolares() {
        // voy a testear compra de dolares

        ArrayList<FactorExclusion> listaFactoresExclusion =
                new ArrayList<FactorExclusion>();

        ArrayList<MontoDescontable> listaDescuentos =
                new ArrayList<MontoDescontable>();

        listaFactoresExclusion.add(new IntegracionManualAnses());
        listaFactoresExclusion.add(dni -> false);

        listaDescuentos.add(dni -> 10);
        listaDescuentos.add(dni -> 50);

        Integer compraDisponible = CalculoRestricciones.calcularCantCompra(
                "22750422",
                listaFactoresExclusion,
                listaDescuentos);

        System.out.println("Compra Disponible: " + compraDisponible);
    }
    public static void main(String[] args) {
        new CienJugadas(new ArrayList<NotificarApostador>()).start();
    }
}
