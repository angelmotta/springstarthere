package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // Sprint context instance

        Parrot p = context.getBean("miki", Parrot.class); // first param is the name of the bean®
        System.out.println(p.getName());

    }
}