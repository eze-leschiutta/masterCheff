package edu.it;

public class SalidaXError implements MiServlet {
    public String doGet() {
        return new StringBuilder()
                .append("<h1>")
                .append("Servicio no reconocido:")
                .append("</h1>")
                .toString();
    }
}
