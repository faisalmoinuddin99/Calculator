package com.upgrad.calculator.services;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService{
    @Override
    public int operate(int x, int y) {
        return x * y;
    }
}
