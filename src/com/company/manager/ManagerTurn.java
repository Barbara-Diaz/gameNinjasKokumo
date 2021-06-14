package com.company.manager;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.validator.TurnValidator;
import com.company.view.Attack;
import com.company.view.Move;
import java.util.List;

public class ManagerTurn {
private String message;
private Move move=new Move();
private Attack attack =new Attack();
private TurnValidator turnValidator=new TurnValidator();


    public boolean turnNinja(Box[][] board,Ninja ninja, int option, Box [][]boardEnemy, String [][]boardSec, List<Ninja> listaNinjasEnemy,List<Ninja> myNinjas){
        boolean sucess=false;
        try {

            if(option==1){
               attack.shoot(boardEnemy,boardSec,listaNinjasEnemy,ninja);
               sucess=true;
               message=" ";
            }

            if (option==2 && ninja.isPreviusTurn()) {
                sucess = false;
                message = "No podes moverte dos turnos consecutivos";
                option = -1;
                }
            if(option==2 && !turnValidator.commanderIsAlive(myNinjas)){
                message="No puedes moverte por que mataron al comandante";
                option=-1;
                sucess=false;

            }

            if (option== 2 && !ninja.isPreviusTurn() && turnValidator.commanderIsAlive(myNinjas) ){
                move.moving(ninja,board);
                sucess=true;
                message="Movimiento realizado con exito";
                }
        }catch (Exception ex){

            message= ex.getMessage();

        }

        return sucess;
    }

    public String getMessage() {
        return message;
    }
}
