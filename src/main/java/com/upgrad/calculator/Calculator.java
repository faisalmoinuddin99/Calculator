package com.upgrad.calculator;

import com.upgrad.calculator.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    @Qualifier("additionService")
    private MathService additionService ;

    @Autowired
    @Qualifier("subtractionService")
    private MathService subtractionService ;

    public int compute(String op, int a, int b){
        if (op.equals("add")){
            return this.additionService.operate(a,b) ;
        }else if(op.equals("sub")){
            return this.subtractionService.operate(a,b) ;
        }else{
            throw new RuntimeException(op + "Not supported") ;
        }
    }
}
