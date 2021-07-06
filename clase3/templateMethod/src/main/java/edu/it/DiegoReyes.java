package edu.it;

public class DiegoReyes implements MiServlet {

    @Override
    public String doGet() {
        return new StringBuilder()
                .append("<h1>")
                .append("Requerimiento Diego:")
                .append("<hr />")
                .append(System.currentTimeMillis())
                .append("</h1>")
                .toString();
    }
}
