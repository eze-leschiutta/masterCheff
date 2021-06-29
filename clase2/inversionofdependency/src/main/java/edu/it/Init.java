package edu.it;

import javax.menu.*;

public class Init {
    public static void main(String[] args) {
        Menu m = MenuFactory.crear("com.jarchitect.menu.MenuFileSystem");
        m.mostrar();
    }
}
