package com.upgrad.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.upgrad.calculator") ;

        Calculator calculator = (Calculator) context.getBean("calculator") ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Operation (add,sub)");
        String op = sc.next();
        System.out.println("X: ");
        int x = sc.nextInt() ;
        System.out.println("Y: ");
        int y = sc.nextInt() ;
        System.out.println("Result: " + calculator.compute(op,x,y));
    }
}
