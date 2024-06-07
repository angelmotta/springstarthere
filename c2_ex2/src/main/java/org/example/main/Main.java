package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // Sprint context instance

        Parrot p = context.getBean(Parrot.class); // Gets a reference of a bean from the context
        System.out.println(p.getName());

        String h = context.getBean(String.class);
        System.out.println(h);

        Integer num = context.getBean(Integer.class);
        System.out.println(num);

    }
}