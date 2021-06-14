package com.company.validator;

import com.company.entity.Ninja;

import java.util.List;

public class TurnValidator {


    public boolean commanderIsAlive(List<Ninja> ninjas){
        boolean success=false;

        for (int i=0;i< ninjas.size();i++){
            if (ninjas.get(i).getId()==3){
                success=true;
                System.out.println(ninjas.get(i).getId());
            }

        }
        return success;
    }

}
