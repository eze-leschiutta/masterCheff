package edu.it.compradolar;

import java.util.List;

public class CalculoRestricciones {
    public static Integer calcularCantCompra(String dni,
            List<FactorExclusion> lstFactoresExclusion,
            List<MontoDescontable> lstMontoDescontable) {

        for (FactorExclusion fe : lstFactoresExclusion) {
            if (fe.estaExcluido(dni)) {
                return 0;
            }
        }

        Integer montoMaximoAsignado = 200;

        for (MontoDescontable md : lstMontoDescontable) {
             montoMaximoAsignado -= md.obtenerMonto(dni);
        }

        return montoMaximoAsignado;
    }
}
