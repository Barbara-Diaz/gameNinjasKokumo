package com.company;

import com.company.game.Board;
import com.company.game.UpDateBoard;
import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.entity.Player;
import com.company.game.Menu;
import com.company.view.PositionNinjas;
import com.company.view.Turn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

       final Player playerOne=new Player();
       final Player playerTwo=new Player();
       final List<Ninja> lis1=new ArrayList<>();
       final Board board=new Board();
        lis1.add(new Ninja(1,"  n  ",false));
        lis1.add(new Ninja(2,"  n  ",false));
        lis1.add(new Ninja(3,"  N  ",false));
       final List<Ninja> lis2=new ArrayList<>();
        lis2.add(new Ninja(1,"  n  ",false));
        lis2.add(new Ninja(2,"  n  ",false));
        lis2.add(new Ninja(3,"  N  ",false));
        Box [][] boardPlayerOne=new Box[5][5];
        String[][] boardSecundaryPlayerOne=new String[5][5];
        Box [][] boardPlayerTwo=new Box[5][5];
        String[][] boardSecundaryPlayerTwo=new String[5][5];
        UpDateBoard upDateBoard =new UpDateBoard();
        board.initialize(boardPlayerOne);
        board.initialize(boardPlayerTwo);
        board.initialize(boardPlayerOne);
        board.initialize(boardPlayerOne);
        playerOne.setNinjas(lis1);
        playerTwo.setNinjas(lis2);
        Menu menu=new Menu();
        PositionNinjas positionNinjas=new PositionNinjas();
      System.out.println("Para comenzar, por favor posicione los ninjas en el tablero indicando fila y columna");
        for (int i=0;i< lis1.size();i++){
               positionNinjas.deployNinjas(boardPlayerOne, lis1.get(i));
               board.show(boardPlayerOne);
        }
       System.out.println("Para comenzar, por favor posicione los ninjas en el tablero indicando fila y columna");
        for (int i=0;i< lis2.size();i++){
                positionNinjas.deployNinjas(boardPlayerTwo, lis2.get(i));
                board.show(boardPlayerTwo);
        }

        Turn turn=new Turn();

        while (lis1.size()>0 && lis2.size()>0) {
           if (lis2.size() > 0 && lis1.size()>0) {

                System.out.println("TURNO JUGADOR UNO");
                for (int i = 0; i < lis1.size(); i++) {
                   if (lis2.size() > 0) {
                       turn.turnNinja(lis1.get(i), boardPlayerOne, boardSecundaryPlayerOne, boardPlayerTwo, lis2,lis1);

                    }

               }
            }

           if (lis1.size() > 0 && lis2.size()>0) {
                System.out.println("TURNO JUGADOR DOS");
                for (int i = 0; i < lis2.size(); i++) {
                    if (lis2.size() > 0) {
                        turn.turnNinja(lis2.get(i), boardPlayerTwo, boardSecundaryPlayerTwo, boardPlayerOne, lis1,lis2);

                    }

                }
           }
        }

        if(lis1.size()==0){
            System.out.println("GANADOR JUGADOR DOS!"); }
        if(lis2.size()==0){
           System.out.println("GANADOR JUGADOR UNO!"); }

    }

}
