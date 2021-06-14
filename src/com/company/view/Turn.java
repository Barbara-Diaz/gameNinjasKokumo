package com.company.view;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.manager.ManagerTurn;

import java.util.List;
import java.util.Scanner;

public class Turn {
private Scanner scanner=new Scanner(System.in);
private int option;
private ManagerTurn managerTurn=new ManagerTurn();
    public void turnNinja(Ninja ninja, Box board[][], String [][]boardSecundary, Box [][] boardEnemy,List<Ninja> listaNijasEnemy,List<Ninja> myNinjas){

        System.out.println(" que desea hacer ?");
        System.out.println(" presione 1- para disparar");
        System.out.println(" presione 2- para moverse una posicion");
        option=scanner.nextInt();

        if (!isValidOption(option)){
            System.out.println(" Opcion invalida, ingrese nuevamente");
            option=scanner.nextInt();
        }

        boolean succes= managerTurn.turnNinja(board,ninja,option,boardEnemy,boardSecundary,listaNijasEnemy,myNinjas);

        if(!succes){
            System.out.println(managerTurn.getMessage());
            turnNinja(ninja,board,boardSecundary,boardEnemy,listaNijasEnemy,myNinjas);
        }

    }

 public boolean isValidOption(int num){

        return num==1 || num==2;
 }

}
