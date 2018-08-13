package com.mgiglione.templateMethod.template.implementations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mgiglione.templateMethod.template.PizzaPreparation;

@Component
@Qualifier("capricciosa")
public class PizzaCapricciosaPreparation extends PizzaPreparation{

    @Override
    public List<String> getToppings() {
        return Arrays.asList("mozzarella", "tomato", "mushrooms", "artichokes", "cooked ham", "olives", "oil");
    }

}
