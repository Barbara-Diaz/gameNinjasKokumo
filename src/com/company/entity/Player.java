package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ninja> ninjas=new ArrayList<>();

    public List<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }


}
