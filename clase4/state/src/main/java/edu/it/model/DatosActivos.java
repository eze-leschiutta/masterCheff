package edu.it.model;

public class DatosActivos {
    public static String precioNyse;
    public static String precioRosario;
    public static Double calcularCCL() {
        try {
            Double nyse = Double.parseDouble(precioNyse);
            Double rosario = Double.parseDouble(precioRosario);

            return rosario / nyse;
        }
        catch(Exception ex) {
            System.out.println("Error, no se puede calcular el CCL");
            ex.printStackTrace();
        }
        return 0d;
    }
}
