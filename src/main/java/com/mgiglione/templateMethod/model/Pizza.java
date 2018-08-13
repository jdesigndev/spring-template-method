package com.mgiglione.templateMethod.model;

import java.util.List;

public class Pizza {
    
    private Dough dough;
    
    private List<String> toppings;

    public Pizza(Dough dough, List<String> toppings) {
        super();
        this.dough = dough;
        this.toppings = toppings;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

}
