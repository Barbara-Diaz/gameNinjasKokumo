package com.company.view;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.game.Board;
import com.company.manager.ManagerAtack;

import java.util.List;
import java.util.Scanner;

public class Attack {
    private final ManagerAtack  managerAtack=new ManagerAtack();
    private final  Board board=new Board();

    public void shoot(Box [][] boardEnemy, String[][] boardSecondary,List<Ninja> listNinjasEnemy,Ninja ninja){
        Scanner scanner=new Scanner(System.in);
        int row;
        int column;
        Box box=new Box();
        System.out.println("Indique coordenadas hacia donde desea disparar: ");
        row=scanner.nextInt();

        if(!isValidCoordinated(row)){
            System.out.println("Coordenada invalida, ingrese nuevamente: ");
            row=scanner.nextInt();
        }

        System.out.println("Ingrese columna : ");
        column= scanner.nextInt();

        if(!isValidCoordinated(column)){
            System.out.println("Coordenada invalida, ingrese nuevamente: ");
            column=scanner.nextInt();
        }
        box.setColum(column);
        box.setRow(row);

        boolean success= managerAtack.attack(box,boardEnemy,boardSecondary,listNinjasEnemy);
        System.out.println(managerAtack.getMessage());
        if(!success){
            shoot(boardEnemy,boardSecondary,listNinjasEnemy,ninja);

        }else {
            ninja.setPreviusTurn(false);
            board.show(boardEnemy);
        }
    }

    public boolean isValidCoordinated(int num){
        boolean succes=false;
        if(num >= 0 && num < 5){
            succes=true;
        }
        return succes;
    }


}
