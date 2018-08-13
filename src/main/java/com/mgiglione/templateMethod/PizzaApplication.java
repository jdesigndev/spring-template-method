package com.mgiglione.templateMethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = { "com.mgiglione" })
public class PizzaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PizzaApplication.class).run(args);
    }

}
