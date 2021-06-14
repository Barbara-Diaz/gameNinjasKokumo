package com.company.manager;

import com.company.entity.Box;
import com.company.entity.Ninja;
import com.company.game.UpDateBoard;
import com.company.validator.BoardValidator;

import java.util.List;

public class ManagerAtack {

    private BoardValidator boardValidator = new BoardValidator();
    private UpDateBoard upDateBoard = new UpDateBoard();
    private String message;

    public boolean attack(Box box, Box[][] boardEnemy, String[][] boardSecundary, List<Ninja> ninjasEnemy) {
        boolean success = false;


        try {
            if (boardValidator.alreadyFired(box, boardEnemy)) {
                success = false;
                message = boardValidator.getMessage();
            } else {
                if (boardValidator.positionisOccupiedForNinja(box, boardEnemy)) {
                    message = boardValidator.getMessage();
                    success = true;
                    if(boardEnemy[box.getRow()][box.getColum()].getConteins().equals("  N  ")){
                        upDateBoard.upDateCommander(box,boardEnemy);
                    }else {
                        deleteNinja(ninjasEnemy, box, boardEnemy);
                        upDateBoard.upDateAttack(boardSecundary, boardEnemy, box);
                    }

                } else {
                    upDateBoard.upDateAttack(boardSecundary, boardEnemy, box);
                    message = "Ups! tiro fallido";
                    success = true;
                }

            }

        } catch (Exception ex) {
            message = ex.getMessage();
        }

        return success;
    }

    public String getMessage() {
        return message;
    }

    public void deleteNinja(List<Ninja> ninjasEnemy, Box box, Box[][] boardEnemy) {
        for (int i = 0; i < ninjasEnemy.size(); i++) {
            System.out.println(boardEnemy[box.getRow()][box.getColum()].getIdNinja());
            if (boardEnemy[box.getRow()][box.getColum()].getIdNinja() == ninjasEnemy.get(i).getId()) {
                    ninjasEnemy.remove(i);
            }

        }

    }
}