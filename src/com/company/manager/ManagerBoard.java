package com.company.manager;

import com.company.entity.Ninja;
import com.company.game.UpDateBoard;
import com.company.entity.Box;
import com.company.validator.BoardValidator;

public class ManagerBoard {
    private String message=new String();
    private BoardValidator boardValidator=new BoardValidator();
    private UpDateBoard upDateBoard =new UpDateBoard();

    public boolean deployNinjas( Box box,Box [][] boardP, Ninja ninja){
        boolean sucess=false;
      try {
          if(!boardValidator.positionIsOccupied(box, boardP)){
                    upDateBoard.upDate(box,boardP,ninja);
                    sucess=true;

          }
          else {
              sucess=false;
              message= boardValidator.getMessage();
          }


      }catch (Exception ex){
          message= ex.getLocalizedMessage();
      }
return sucess;
    }


    public String getMessage() {
        return message;
    }
}
