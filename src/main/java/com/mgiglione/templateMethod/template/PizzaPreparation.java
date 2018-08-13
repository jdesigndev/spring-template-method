package com.mgiglione.templateMethod.template;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mgiglione.templateMethod.model.Dough;
import com.mgiglione.templateMethod.model.Pizza;


public abstract class PizzaPreparation {

    Logger logger=LoggerFactory.getLogger(this.getClass());
    
    
    public Dough prepareDough() {
        logger.info("Preparing dough..");
        return new Dough();
    }
    
    public  void rollOutDough(Dough dough) {
        logger.info("Rolling out dough..");
        dough.setRolledOut(true);
    }
    
    public Pizza addToppings(List<String> toppings,Dough dough) {
        logger.info("Adding Toppings..");
        return new Pizza(dough,toppings);
        
    }
    
    public Pizza prepare() {
        Dough dough = prepareDough();
        rollOutDough(dough);
        Pizza pizza = addToppings(getToppings(), dough);
        logger.info("Your pizza is ready");
        logger.info("Toppings are:"+pizza.getToppings() );
        return pizza;
    }
    
    /**
     * This is the only abstract method of this class. Your sublcass must provide an implementation to make a new preparation
     * @return A list of toppings
     */
    public abstract List<String> getToppings();
    
    
}
