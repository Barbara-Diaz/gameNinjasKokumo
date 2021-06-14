package com.company.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Menu extends Thread {
    private final Scanner entry=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run(){
            String option;
            int optionMenu;
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("       1-Crear partida");
            System.out.println("       2-Unirse a una partida");
            System.out.println("       3-Salir");
            System.out.println("       4-Sobre el juego");

            optionMenu=entry.nextInt();

            if(optionMenu==1){

                try {
                    createGame();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
            if(optionMenu==2){
                joinn();
            }
            if(optionMenu==3){
                System.exit(0);
            }
            if(optionMenu==4){
                System.out.println("Juego creado para Laboratorio Y Programacion III - UTN");
                try {
                    option= br.readLine();
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
    public void createGame() throws UnknownHostException {

        int option;

        System.out.println(" 1-Invitar a un amigo");
        System.out.println(" 2-Salir");

        option=entry.nextInt();

        if(option==1){

        }

        if(option==2){
            System.exit(0);
        }


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
        return InetAddress.getByName(adr);
    }
}