package com.mgiglione.templateMethod.test;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mgiglione.templateMethod.model.Pizza;
import com.mgiglione.templateMethod.template.PizzaPreparation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPizzaPreparation {

    
    @Autowired
    @Qualifier("margherita")
    PizzaPreparation margheritaPreparation;
    
    @Autowired
    @Qualifier("capricciosa")
    PizzaPreparation capricciosaPreparation;
    
    @Test
    public void testMargheritaPreparation() {
        Pizza margherita = margheritaPreparation.prepare();
        assertTrue(margherita.getToppings().contains("basil"));
    }
    
    @Test
    public void testCapricciosaPreparation() {
        Pizza capricciosa = capricciosaPreparation.prepare();
        assertTrue(capricciosa.getToppings().contains("cooked ham"));
    }
    
    
    
    
}
