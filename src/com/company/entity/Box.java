package com.company.entity;

public class Box {
private String conteins=new String();
private int idNinja;
private boolean isOccupied;
private int row;
private int colum;


    public Box(String conteins) {
        this.conteins = conteins;
    }

    public String getConteins() {
        return conteins;
    }

    public void setConteins(String conteins) {
        this.conteins = conteins;
    }

    public Box(){

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(int idNinja) {
        this.idNinja = idNinja;
    }
}
