package edu.it.servicios;

public class Hora implements javax.menu.ItemMenu {

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
    }

}
