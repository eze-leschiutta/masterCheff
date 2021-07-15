package edu.it.ejemplosimple;

import edu.it.estados.IState;

public class Estado2 implements IState {
    public IState go() {
        System.out.println("Estado 2");
        return new Estado1();
    }
}
