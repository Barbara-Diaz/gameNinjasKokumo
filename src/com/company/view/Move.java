package com.company.view;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.game.Board;
import com.company.manager.ManagerMove;

import java.util.Scanner;

public class Move {

    private Scanner scanner=new Scanner(System.in);
    private int option;
    private Board boardd=new Board();

    private ManagerMove managerMove=new ManagerMove();
    public void viewMenu() {
        System.out.println("Elije una opcion");
        System.out.println("1-Up");
        System.out.println("2-Down");
        System.out.println("3-Right");
        System.out.println("4-Left");
        System.out.println("5-Up Left");
        System.out.println("6-Up Right");
        System.out.println("7-Down Left");
        System.out.println("8-Down Right");
    }


    public void moving(Ninja ninja, Box [][]board){
        viewMenu();
        option= scanner.nextInt();

        if (!isValidOpcion(option)){
            System.out.println("opcion invalida");
            viewMenu();
            option= scanner.nextInt();
        }

        boolean succes=managerMove.moves(ninja, board,option);
        if (!succes){
            System.out.println(managerMove.getMessage());
            moving(ninja,board);

        }else {
            boardd.show(board);
        }


    }


    public boolean isValidOpcion(int num){
        boolean sucess=false;

        if(num>0 && num<9){
            sucess=true;
        }
     return sucess;
    }

}
