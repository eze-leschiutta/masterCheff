package edu.it.compradolar;

import java.util.Scanner;

public class IntegracionManualAnses implements FactorExclusion {

    @Override
    public boolean estaExcluido(String dni) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese SI si el dni esta autorizado: " + dni);
        String lectLinea = scn.nextLine();

        if (lectLinea.toLowerCase().contains("si")) {
            return false;
        }
        return true;
    }
}
