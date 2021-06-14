package com.company.conexion;

import com.company.game.Menu;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Servidor {
    Menu menu=new Menu();

    public void star() throws IOException {
        HttpServer httpServer= HttpServer.create(new InetSocketAddress(9009),0);
        HttpContext ctx= httpServer.createContext("/");
        ctx.setHandler(Servidor::invitation);
        httpServer.start();
    }

    private static void invitation(HttpExchange httpExchange) throws IOException {
        final int CODIGO_RESPUESTA=200;
        String contenido= "Unite a una partida o espera a ser invitado";
        httpExchange.sendResponseHeaders(CODIGO_RESPUESTA,contenido.length());
        OutputStream os=httpExchange.getResponseBody();
        os.write(contenido.getBytes());
        os.close();
    }



}
