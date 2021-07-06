package edu.it;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class MiAppServer {
    private String crearCabeceras(int contentLength, int httpCode) {
        return String.join("\n", new String[] {
            String.join(" ", "HTTP/1.1", String.valueOf(httpCode), "OK"),
            "X-Powered-By: MasterCheff",
            "Content-Type: text/html;charset=UTF-8",
            "Content-Length: ".concat(String.valueOf(contentLength))
            .concat("\n\n")
        });
    }
    private void responder(Socket skt, String mensaje, Integer httpCode) throws Exception {
        OutputStream outputStream = skt.getOutputStream();

        String cabeceras = crearCabeceras(mensaje.length(), httpCode);

        String todoElMensaje = cabeceras.concat(mensaje);

        outputStream.write(todoElMensaje.getBytes("utf-8"));
        outputStream.flush();

        skt.getInputStream().close();
        outputStream.close();
        skt.close();
    }
    private void procesar(Socket skt) throws Exception {
        final int MAX_LENGTH = 100000;

        InputStream is = skt.getInputStream();
        byte[] buffer = new byte[MAX_LENGTH];
        int bytesLeidos = is.read(buffer, 0, MAX_LENGTH);
        String strLeido = new String(buffer, 0, bytesLeidos);

        System.out.println(strLeido);

        String[] cabeceras = strLeido.split("\n");

        for (String s : cabeceras) {
            System.out.println(s);
        }

        // Analizar las cabeceras de http y formular una respuesta

        if (cabeceras.length == 0) {
            responder(skt, "Requerimiento mal formulado", 400);
            return;
        }

        String primeraCabecera = cabeceras[0];
        String[] analisisGET = primeraCabecera.split(" ");

        if (analisisGET.length < 3) {
            responder(skt, "Requerimiento mal formulado", 400);
            return;
        }

        StringHttpCode respuesta = evaluar(analisisGET[1]);
        responder(skt, respuesta.mensaje, respuesta.httpCode);
    }

    public void init() {
        ServerSocket serverSocket = null;

        for (;;) {
            try {
                serverSocket = new ServerSocket(11500);
                for (;;) {
                    System.out.println("Esperando conexion...");
                    Socket skt = serverSocket.accept();
                    procesar(skt);
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    protected abstract StringHttpCode evaluar(String url);
}
