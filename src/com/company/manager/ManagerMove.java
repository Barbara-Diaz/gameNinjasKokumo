package com.company.manager;

import com.company.entity.Ninja;
import com.company.game.UpDateBoard;
import com.company.entity.Box;
import com.company.validator.BoardValidator;
import com.company.validator.MoveValidator;

public class ManagerMove {

    private MoveValidator moveValidator=new MoveValidator();
    private UpDateBoard upDateBoard =new UpDateBoard();
    private BoardValidator boardValidator=new BoardValidator();
    private String message;

    public boolean moves(Ninja ninja, Box [][]boardp, int option){
        boolean success=false;

        Box boxNew=new Box();

        try {
            if(option==1){
                if (moveValidator.isValidUp(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow()-1);
                    boxNew.setColum(ninja.getBox().getColum());
                    success= move(ninja,boardp,boxNew);
                }else {
                    message= moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==2){
                if (moveValidator.isValidDown(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow()+1);
                    boxNew.setColum(ninja.getBox().getColum());
                    success=move(ninja,boardp,boxNew);

                }else {
                    message=moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==3){
                if (moveValidator.isValidRight(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow());
                    boxNew.setColum(ninja.getBox().getColum()+1);
                    success=move(ninja,boardp,boxNew);

                }
            }
            if (option==4){
                if (moveValidator.isValidLeft(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow());
                    boxNew.setColum(ninja.getBox().getColum()-1);
                    success=move(ninja,boardp,boxNew);

                }else {
                    message=moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==5){
                if (moveValidator.isValidUpLeft(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow()-1);
                    boxNew.setColum(ninja.getBox().getColum()-1);
                    success=move(ninja,boardp,boxNew);
                }else {
                    message= moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==6){
                if (moveValidator.isValidUpRight(ninja.getBox().getRow(), ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow()-1);
                    boxNew.setColum(ninja.getBox().getColum()+1);
                    success=move(ninja,boardp,boxNew);

                }else {
                    message=moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==7){
                if (moveValidator.isValidDownLeft(ninja.getBox().getRow(),ninja.getBox().getColum())){
                    boxNew.setRow(ninja.getBox().getRow()+1);
                    boxNew.setColum(ninja.getBox().getColum()-1);
                    success=move(ninja,boardp,boxNew);

                }else {
                    message=moveValidator.getMessage();
                    success=false;
                }
            }
            if (option==8){
                if (moveValidator.isValidDownRight(ninja.getBox().getRow(), ninja.getBox().getColum())){

                    boxNew.setRow(ninja.getBox().getRow()+1);
                    boxNew.setColum(ninja.getBox().getColum()+1);
                    success=move(ninja,boardp,boxNew);

                }else {
                    message=moveValidator.getMessage();
                    success=false;
                }
            }
        }catch (Exception ex) {

            message = ex.getMessage();

        }


        return success;
    }


    public String getMessage() {

        return message;
    }

    public boolean move(Ninja ninja,Box [][]boardp,Box boxNew){
        boolean succes;

        if(boardValidator.positionIsOccupied(boxNew,boardp)){
            message= boardValidator.getMessage();
            succes=false;
        }else {
            upDateBoard.upDateMove(boxNew,boardp,ninja);
            upDateBoard.previusUpdateMove(ninja.getBox(), boardp);
            succes=true;
            ninja.setPreviusTurn(true);
        }

        return succes;
    }
}
