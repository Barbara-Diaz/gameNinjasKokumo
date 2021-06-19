package com.company.conexion;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Servidor {
    public void star() throws IOException {
        HttpServer server= HttpServer.create(new InetSocketAddress(9009),0);
        server.createContext("/",new RootHandler());
        server.createContext("/invitacion",new InvitationHandler());
        server.createContext("/deployNinjas",new GetHandler());
        server.setExecutor(null);
        server.start();

    }
}
