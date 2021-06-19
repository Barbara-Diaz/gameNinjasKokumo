package com.company.conexion;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class InvitationHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        final int CODIGO_RESPUESTA=200;
        String contenido="hola como estas";
        httpExchange.sendResponseHeaders(CODIGO_RESPUESTA,contenido.length());
        OutputStream os=httpExchange.getResponseBody();
        os.write(contenido.getBytes());
        os.close();
    }
}
