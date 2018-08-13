package com.mgiglione.templateMethod.model;

import java.util.List;

public class Dough {

    private Boolean rolledOut;

    private List<String> toppings;

    public Boolean getRolledOut() {
        return rolledOut;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setRolledOut(Boolean rolledOut) {
        this.rolledOut = rolledOut;
    }
    
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
    
    
}
