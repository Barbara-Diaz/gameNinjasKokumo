package com.company.game;

import com.company.entity.Box;

public class Board {

    public void initialize(Box[][] board){
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                board[i][j]=new Box("  0  ");
                board[i][j].setOccupied(false);
                board[i][j].setRow(i);
                board[i][j].setColum(j);
            }
        }
    }

    public void show(Box [][] board){
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(board[i][j].getConteins());
            }
            System.out.println("  ");
        }
    }

    public void show(String [][] board){
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("  ");
        }
    }

}
