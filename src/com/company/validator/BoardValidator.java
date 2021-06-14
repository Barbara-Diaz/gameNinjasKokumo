package com.company.validator;

import com.company.entity.Box;

public class BoardValidator {
    private String message;

    public boolean positionIsOccupied(Box box, Box [][]board){
        boolean succes=false;
     if (board[box.getRow()][box.getColum()].isOccupied()){
         succes=true;
         message="este casillero esta ocupado";

     }

     return succes;
    }

    public boolean positionisOccupiedForNinja( Box box, Box[][] board){
        boolean sucess=false;
        if(board[box.getRow()][box.getColum()].getConteins().equals("  n  ")){
            sucess=true;
            message="Buen tiro !! Eliminaste un ninja";

        }
        if(board[box.getRow()][box.getColum()].getConteins().equals("  N  ")){
            sucess=true;
            message="Buen tiro !!";

        }

        return sucess;
    }

    public boolean alreadyFired(Box box, Box[][] board){
        boolean sucess=false;
        if(positionIsOccupied(box,board) &&
                board[box.getRow()][box.getColum()].getConteins().equals("  X  ")){
            sucess=true;
            message=" Ya disparaste en esta posicion";

        }


        return sucess;
    }

    public String getMessage() {
        return message;
    }
}
