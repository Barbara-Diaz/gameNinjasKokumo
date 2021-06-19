package com.company.game;

import com.company.conexion.Client;
import com.company.conexion.Servidor;
import inet.ipaddr.AddressStringException;
import inet.ipaddr.IPAddress;
import inet.ipaddr.IPAddressString;
import inet.ipaddr.ipv4.IPv4Address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Menu extends Thread {
    private final Scanner entry=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Servidor servidor =new Servidor();

    public void menuu() {
        String option;
        System.out.println(" ");
        System.out.println("                        Welcome!!");
        System.out.println(" ");
        System.out.println("                    KOKUMO NO MONOGATARI                ");
        System.out.println(" ");
        System.out.println("                   Press Enter to continue              ");
        option = entry.nextLine();
    }

    public void run() {
        String option;
        int optionMenu;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("       1-Unirse a una partida");
        System.out.println("       2-Salir");
        System.out.println("       3-Sobre el juego");

        optionMenu = entry.nextInt();

        if (optionMenu == 1) {


        }
        if (optionMenu == 2) {
            System.exit(0);
        }

        if (optionMenu == 3) {
            System.out.println("Juego creado para Laboratorio Y Programacion III - UTN");
            try {
                option = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            run();
        }

    }

    public void startt() {
        String option;
        System.out.println(" ");
        System.out.println("                        Welcome!!");
        System.out.println(" ");
        System.out.println("                    N I N J A ' S   G A M E                 ");
        System.out.println(" ");
        System.out.println("                   Press Enter to continue              ");
        option = entry.nextLine();
    }


    public void joinn(){
        int option;

        System.out.println(" 1-Enviar solicitud");
        System.out.println("2-Salir");
        option= entry.nextInt();

        if(option==1){
        }

        if(option==2){
            System.exit(0);
        }

    }

    public InetAddress obtenerIp() throws UnknownHostException {

        String adr;
        System.out.println("Ingrese IP");
        adr= entry.next();
        System.out.println(InetAddress.getByName(adr));

        return InetAddress.getByName(adr);
    }
}