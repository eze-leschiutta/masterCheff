package edu.it.servicios;

public class Saludar implements javax.menu.ItemMenu {
    @Override
    public void run() {
        for (Integer x: new Integer[1000]) {
            System.out.println("Saludos ...");
        }
        throw new RuntimeException("Aca falla y va a para a un nivel mas abajo");
    }
}
