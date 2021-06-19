package com.company.conexion;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.game.Board;
import com.company.game.Menu;
import com.company.view.PositionNinjas;
import com.company.view.Turn;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetHandler implements HttpHandler{


    @Override
    public void handle(HttpExchange he) throws IOException {

        Menu menu=new Menu();
       // parse request
        Map<String, Object> parameters = new HashMap<String, Object>();
        URI requestedUri = he.getRequestURI();
       String query = requestedUri.getRawQuery();

        // send response
        String response = "";
        for (String key : parameters.keySet())
            response += key ;
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.toString().getBytes());

        os.close();

    }

    }

