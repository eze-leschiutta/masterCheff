package edu.it.util;

public class Utiles {
    public static void dormir(Integer x) {
        try {
            Thread.sleep(x*1000);
        }
        catch (Exception ex) {
        }
    }
    public static void dormir() {
        dormir(1);
    }
}
