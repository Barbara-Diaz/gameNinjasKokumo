package com.company.entity;

public class Ninja {
    private int id;
    private String conteins;
    private Box box=new Box();
    private boolean previusTurn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Ninja(int id, String conteins,boolean previusTurn) {
        this.id = id;
        this.conteins = conteins;
        this.previusTurn=previusTurn;
    }

    public String getConteins() {
        return conteins;
    }

    public void setConteins(String conteins) {
        this.conteins = conteins;
    }

    public boolean isPreviusTurn() {
        return previusTurn;
    }

    public void setPreviusTurn(boolean previusTurn) {
        this.previusTurn = previusTurn;
    }
}
