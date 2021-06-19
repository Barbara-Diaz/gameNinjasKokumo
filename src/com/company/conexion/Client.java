package com.company.conexion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Client {
    private Scanner entry=new Scanner(System.in);
    URL url;


    public void client() throws IOException {
        url=new URL("http://localhost:9009");
        URLConnection urlConnection= url.openConnection();
        BufferedReader in=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String linea;
        while ((linea = in.readLine()) != null) {
            System.out.println(linea);

        }
    }


}
