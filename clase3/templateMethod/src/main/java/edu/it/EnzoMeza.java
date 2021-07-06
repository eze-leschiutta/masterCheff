package edu.it;

import java.util.UUID;

public class EnzoMeza implements MiServlet {

    @Override
    public String doGet() {
        return new StringBuilder()
                .append("<h1>")
                .append("Requerimiento Diego:")
                .append("<hr />")
                .append(UUID.randomUUID().toString())
                .append("</h1>")
                .toString();
    }
}
