package com.company.view;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.manager.ManagerBoard;

import java.util.Scanner;

public class PositionNinjas {
    private final Scanner scanner=new Scanner(System.in);
    private final  ManagerBoard managerBoard=new ManagerBoard();

    public void deployNinjas(Box [][] board,Ninja nin){
        Box box=new Box();
        int row;
        int colum;
        System.out.println("Ingrese fila:");
        row=scanner.nextInt();
        if(!isValidCoordinate(row)){
            System.out.println("Coordenada invalida");
            row=scanner.nextInt();
        }

        System.out.println("ingrese columna:");
        colum=scanner.nextInt();

        if(!isValidCoordinate(colum)){
            System.out.println("Coordenada invalida");
            colum=scanner.nextInt();
        }
        box.setRow(row);
        box.setColum(colum);
        boolean succes=managerBoard.deployNinjas(box,board,nin);

        if (!succes){
            System.out.println(managerBoard.getMessage());
            deployNinjas(board,nin);
        }
        nin.setBox(box);

    }

    public boolean isValidCoordinate(int num){
        boolean sucess=false;
        if(num>=0 && num<5){
            sucess=true;
        }
        return sucess;
    }

}
