package edu.it;

public class IndicadorNumerosPrimosTrucho implements EstrategiaAgregaTexto {
    public String apply(Integer x) {
        if (x == 2 || x == 3 || x == 5 || x == 7) {
            return "Es numero primo";
        }
        return "";
    }
}
