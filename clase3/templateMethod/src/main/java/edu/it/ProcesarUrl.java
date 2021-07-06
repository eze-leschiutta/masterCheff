package edu.it;

import java.util.HashMap;
import java.util.Map;

public class ProcesarUrl extends MiAppServer {
    private Map<String, MiServlet> mapaStrSrv = new HashMap<>();

    public ProcesarUrl() {
        // Ir a github, o a un archivo local, etc
        // la forma que tendría que tener ese archivo seria
        // diego=edu.it.DiegoReyes
        // enzo=edu.it.EnzoMeza
        // lucas=edu.it.LucasVera
        try {
            mapaStrSrv.put("/diego", (MiServlet)Class.forName("edu.it.DiegoReyes").getConstructor().newInstance());
            mapaStrSrv.put("/enzo", (MiServlet)Class.forName("edu.it.EnzoMeza").getConstructor().newInstance());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            mapaStrSrv = new HashMap<>();
            mapaStrSrv.put("/error", new SalidaXError());
        }
    }

    protected StringHttpCode evaluar(String url) {
        MiServlet miSrv = mapaStrSrv.get(url);

        if (miSrv == null) {
            return new StringHttpCode(new SalidaXError().doGet(), 404);
        }
        return new StringHttpCode(miSrv.doGet(), 200);
    }
}
