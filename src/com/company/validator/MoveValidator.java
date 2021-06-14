package com.company.validator;

import com.company.entity.Ninja;

import java.util.List;

public class MoveValidator {

    private String message=new String();

    public boolean isValidUp(int row,int colum){
        boolean succes=true;
        if(row==0){
            succes=false;
            message="No puedes subir una fila";
        }

        return succes;
    }
    public boolean isValidDown(int row,int colum){
        boolean succes=true;
        if(row==4){
            message="No puedes bajar una fila";
            succes=false;
        }
        return succes;
    }
    public boolean isValidLeft(int row,int colum){
        boolean succes=true;
        if(colum==0){
            message="No puedes ir a la izquiera";
            succes=false;
        }

        return succes;
    }
    public boolean isValidRight(int row,int colum){
        boolean succes=true;
        if(colum==4) {
            message = "No puedes ir a la derecha";
            succes = false;
        }
        return succes;
    }
    public boolean isValidUpRight(int row,int colum){
        boolean succes=true;
        if(row==0 || colum==4){
            message="No puedes subir una fila ni ir a la derecha";
            succes=false;
        }
        return succes;
    }
    public boolean isValidUpLeft(int row,int colum){
        boolean succes=true;
        if(row==0 || colum==0){
            message="No puedes subir una fila ni ir a la izquierda";
            succes=false;
        }
        return succes;
    }
    public boolean isValidDownRight(int row,int colum){
        boolean succes=true;
        if(row==4 || colum==4){
            message="No puedes bajar una fila ni ir a la derecha";
            succes=false;
        }
        return succes;
    }
    public boolean isValidDownLeft(int row,int colum){
        boolean sucess=true;
        if(row==4 || colum==0){
            message="No puedes bajar una fila ni ir a la izquierda";
            sucess=false;
        }
        return sucess;
    }




    public String getMessage() {
        return message;
    }





}
