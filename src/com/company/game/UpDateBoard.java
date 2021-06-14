package com.company.game;

import com.company.entity.Box;
import com.company.entity.Ninja;

public class UpDateBoard {

    public void upDate(Box box,Box [][] board,Ninja ninja){
        board[box.getRow()][box.getColum()].setConteins(ninja.getConteins());
        board[box.getRow()][box.getColum()].setOccupied(true);
        board[box.getRow()][box.getColum()].setRow(box.getRow());
        board[box.getRow()][box.getColum()].setColum(box.getColum());
        board[box.getRow()][box.getColum()].setIdNinja(ninja.getId());
        ninja.setBox(box);
    }

    public void upDateAttack(String [][] boardSecundary,Box [][] boardEnemy,Box box){
        boardEnemy[box.getRow()][box.getColum()].setConteins("  X  ");
        boardEnemy[box.getRow()][box.getColum()].setColum(box.getColum());
        boardEnemy[box.getRow()][box.getColum()].setRow(box.getRow());
        boardEnemy[box.getRow()][box.getColum()].setOccupied(true);
        boardEnemy[box.getRow()][box.getColum()].setIdNinja(0);
        boardSecundary[box.getRow()][box.getColum()]="  X  ";
    }

    public void upDateMove(Box box, Box board[][], Ninja ninja){
        board[box.getRow()][box.getColum()].setConteins(ninja.getConteins());
        board[box.getRow()][box.getColum()].setOccupied(true);
        board[box.getRow()][box.getColum()].setColum(box.getColum());
        board[box.getRow()][box.getColum()].setRow(box.getRow());
        board[box.getRow()][box.getColum()].setIdNinja(ninja.getId());
    }

    public void previusUpdateMove(Box box,Box board[][]){
        board[box.getRow()][box.getColum()].setOccupied(false);
        board[box.getRow()][box.getColum()].setConteins("  0  ");
        board[box.getRow()][box.getColum()].setColum(box.getColum());
        board[box.getRow()][box.getColum()].setRow(box.getRow());
        board[box.getRow()][box.getColum()].setIdNinja(0);
    }

    public void upDateCommander(Box box,Box board[][]){
        board[box.getRow()][box.getColum()].setIdNinja(3);
        board[box.getRow()][box.getColum()].setConteins("  n  ");
        board[box.getRow()][box.getColum()].setOccupied(true);
        board[box.getRow()][box.getColum()].setColum(box.getColum());
        board[box.getRow()][box.getColum()].setRow(box.getRow());
    }


}
